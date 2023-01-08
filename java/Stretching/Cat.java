package com.example.fitnessapp.stretching;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class Cat extends AppCompatActivity {
    private int seconds = 35;
    private boolean running = true;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteen_rest);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.cat);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Cat Stretch");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. Start on your hands and knees with your wrists directly under your shoulders, and your knees directly under your hips.\n" +
                "2. Point your fingertips to the top of your mat.\n"+
                "3. Place your shins and knees hip-width apart.\n"+
                "4. Center your head in a neutral position and soften your gaze downward.\n"+
                "5. As you exhale, draw your belly to your spine and round your back toward the ceiling.\n"+
                "6. The pose should look like a cat stretching its back.\n"+
                "7. Hold for as long as it is comfortable and do another rep uptil 30 seconds\n"+
                "Breath gently when pushing and do not force yourself to do more.");
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
