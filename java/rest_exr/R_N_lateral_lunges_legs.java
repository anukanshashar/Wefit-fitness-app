package com.example.fitnessapp.rest_exc;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class R_N_lateral_lunges_legs extends AppCompatActivity {
    private int seconds = 15;
    private boolean running = true;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteen_rest);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.legs_exersices_lateral_lunges);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Lateral Lunges");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. Stand straight with your feet hip-width apart.\n" +
                "2. Step out to the side and transfer your weight to that leg.\n" +
                "3. Use your lead foot to push you back to the starting position.\n" +
                "4. Repeat and then switch sides.\n\n"+
                "When doing the side lunge, pull your abs in, keep your back straight and face forward. Donâ€™t step too wide to the side, breathe in, and keep your knees pointing in the same direction as your feet. Keep both heels flat on the floor and, as you breathe out, use the lead foot to push you back into the starting position.");
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