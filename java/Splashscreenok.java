package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class  Splashscreenok extends AppCompatActivity {
    Animation up,down;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreenok);

        TextView textView = findViewById(R.id.quote);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView.setAnimation(down);
        TextView textView1 = findViewById(R.id.quote1);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView1.setAnimation(down);
        TextView textView2 = findViewById(R.id.writer);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView2.setAnimation(down);
        ImageView textView3 = findViewById(R.id.imageView1);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_left);
        textView3.setAnimation(down);
        ImageView textView4 = findViewById(R.id.imageView2);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right);
        textView4.setAnimation(down);
        ImageView textView5 = findViewById(R.id.imageView3);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_right);
        textView5.setAnimation(down);
        ImageView textView6 = findViewById(R.id.imageView4);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_right);
        textView6.setAnimation(down);
        ImageView textView7 = findViewById(R.id.imageView5);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView7.setAnimation(down);
        ImageView textView8 = findViewById(R.id.imageView6);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        textView8.setAnimation(down);
        ImageView textView9 = findViewById(R.id.imageView8);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top_left);
        textView9.setAnimation(down);
        ImageView textView10 = findViewById(R.id.imageView9);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left);
        textView10.setAnimation(down);
        ImageView textView11 = findViewById(R.id.we_fit);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        textView11.setAnimation(down);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                finish();
            }
        },4000);
    }
    }

