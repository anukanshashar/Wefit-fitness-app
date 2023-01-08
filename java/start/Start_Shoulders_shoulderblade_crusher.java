package com.example.fitnessapp.start;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class Start_Shoulders_Shoulder_Blades_Crusher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.exersice_22);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Shoulder Blades Crusher");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. With dumbbells, bend at the waist so that your upper body is nearly parallel to the floor. Keep your back straight. \n" +
                "2. Hold the dumbbells straight down below you. This is the start position.\n" +
                "3. Lift the dumbbells straight up. Hold the up position for 2 seconds.\n" +
                "4. Return to the start position.");

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
