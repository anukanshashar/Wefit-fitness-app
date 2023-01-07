package com.example.fitnessapp.rest_exc;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class R_N_reverse_lunges_legs extends AppCompatActivity {
    private int seconds = 15;
    private boolean running = true;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteen_rest);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.legs_exersices_reverse_lunge);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Reverse Lunges");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. Stand with your feet hip-width apart, take a step forward and then slowly bend both knees until your back knee is just above the floor.\n" +
                "2. Stand back up, take a step back with the same leg, and bend both knees until your back knee is just above the floor.\n" +
                "3. Repeat this back and forth movement for the entire duration of the set, and then switch legs.\n\n"+
                "Maintain your back straight, keep your shoulders back and tighten the abs. Breathe in as you lunge and keep your weight in the front heel. Breathe out as you push back up to the starting position, and maintain your feet hip-width apart throughout the entire exercise.");
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