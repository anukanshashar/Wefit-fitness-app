package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Animation down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView textView11 = findViewById(R.id.logo);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        textView11.setAnimation(down);

        Button newu = findViewById(R.id.newuser);
        Button existing = findViewById(R.id.exist);

        newu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Register.class);
                startActivity(intent);
            }
        });
        existing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, LoginAct.class);
                startActivity(intent);
            }
        });

    }}
