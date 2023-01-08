package com.example.fitnessapp.stretching;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class Leg_Side_Swing extends AppCompatActivity {
    private int seconds = 35;
    private boolean running = true;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching_back);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.leg_side_swing);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Leg Side Swing");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. Stand straight with your feet hip-width apart and hold onto a wall.\n" +
                "2. Keeping one leg stationary, slowly raise the left leg till 90 degree angle with ground in a single smooth movement.\n"
                +"3. Slowly bring it back in a swinging motion\n"+
                "3. Repeat until set is complete.\n\n"+
                "Keep your abs tight, your upper body stable, and maintain a steady and deep breathing pattern. Actively use your muscles to swing the legs and, with each swing, take your leg closer to its full range of motion. Keep the movement fluid and swing the leg as high as you can without losing form.");
        runTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        wasRunning = running;
        running = false;
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }
    public void onClickStart(View view)
    {
        running = true;
    }
    public void onClickStop(View view)
    {
        running = false;
    }
    public void onClickReset(View view)
    {
        running = false;
        seconds = 45;
    }
    private void runTimer() {
        final TextView timeView = (TextView) findViewById(R.id.timer);
        final Handler handler = new Handler();

        // handler is used to send and process message and runnable objects associated with threads queue
        handler.post(new Runnable() {
            @Override
            public void run() {
                int secs = seconds % 60;
                String time = String.format(Locale.getDefault(), "%02d", secs);
                timeView.setText(time);
                if (running && seconds >= 1) {
                    seconds--;
                }
                if(seconds==0){
                    finish();
                }
                handler.postDelayed(this, 1000);
            }

        });

    }
}