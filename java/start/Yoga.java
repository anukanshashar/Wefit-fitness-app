package com.example.fitnessapp.areas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;
import com.example.fitnessapp.stretching.Neck_Side;
import com.example.fitnessapp.stretching.Toe_Stretch;

public class Yoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);
        Button start = (Button) findViewById(R.id.start1);
        Button start1 = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_pre_worout();
            }
        });
        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_post_worout();
            }
        });
    }

    private void open_post_worout() {
        Intent intent = new Intent(this, Toe_Stretch.class);
        startActivityForResult(intent, 12);
    }

    private void open_pre_worout() {
        Intent intent = new Intent(this, Neck_Side.class);
        startActivityForResult(intent, 2);
    }
}