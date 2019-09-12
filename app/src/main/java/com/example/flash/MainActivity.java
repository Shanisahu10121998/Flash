package com.example.flash;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
MediaPlayer am;
Thread timer;
Button button;
Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        am=MediaPlayer.create(MainActivity.this,R.raw.tuhi);
        am.start();
        timer=new Thread(){
                public void run()
        {
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Intent on=new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(on);
            }
        }
        };
        timer.start();


    }
}
