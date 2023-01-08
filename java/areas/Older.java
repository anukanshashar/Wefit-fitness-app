package com.example.fitnessapp.areas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.example.fitnessapp.MainActivity;
import com.example.fitnessapp.R;

import java.util.Locale;

public class Older extends Activity {
    private int seconds = 45;
    private boolean running = true;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_older);
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
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
    private void runTimer()
    {
        final TextView timeView = (TextView)findViewById(R.id.time_view);
        final Handler handler = new Handler();

        // handler is used to send and process message and runnable objects associated with threads queue
        handler.post(new Runnable() {
            @Override
            public void run()
            {
                int secs = seconds % 60;
                String time = String.format(Locale.getDefault(), "%02d",secs);
                timeView.setText(time);
                if (running && seconds >= 1) {
                    seconds--;
                }
                handler.postDelayed(this, 1000);
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        },45000);
    }
}