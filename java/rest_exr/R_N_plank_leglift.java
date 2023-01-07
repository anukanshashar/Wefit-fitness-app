package com.example.fitnessapp.rest_exc;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class R_N_plank_leglift extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteen_rest);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.exersice_11);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Plank + Leg Lift");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. Start in a low plank position with your body in a straight line, your elbows bent and under your shoulders, and your feet hip-width apart.\n" +
                "2. Lift your left leg to 45-degree angle and hold.\n" +
                "3. Switch legs and repeat.\n\n"+"Keep your core tight, your glutes engaged, maintain your back flat and your hips level.Lift your leg, being careful notto arch your back, and hold foras long asyou can.Breathe inasyou lowerthe leg and return tothe plank position.");
        runTimer();
    }
    private int seconds = 15;
    private boolean running = true;
    private boolean wasRunning;
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
        seconds = 15;
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