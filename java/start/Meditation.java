package com.example.fitnessapp.areas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

public class Meditation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        MediaPlayer one = MediaPlayer.create(this, R.raw.one_minute_final);
        MediaPlayer four = MediaPlayer.create(this, R.raw.four_minute_final);
        MediaPlayer ten = MediaPlayer.create(this, R.raw.ten_minute_brach_final);
        MediaPlayer fifteen = MediaPlayer.create(this, R.raw.fifteen_minute_final);

        Button play = (Button)findViewById(R.id.play);
        Button pause =(Button) findViewById(R.id.pause);
        Button play1 = (Button)findViewById(R.id.play1);
        Button pause1 =(Button) findViewById(R.id.pause1);
        Button play2 = (Button)findViewById(R.id.play2);
        Button pause2 =(Button) findViewById(R.id.pause2);
        Button play3 = (Button)findViewById(R.id.play3);
        Button pause3 =(Button) findViewById(R.id.pause3);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.pause();
            }
        });
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four.start();
            }
        });

        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four.pause();
            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ten.start();
            }
        });

        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ten.pause();
            }
        });
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fifteen.start();
            }
        });

        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fifteen.pause();
            }
        });

    }
}