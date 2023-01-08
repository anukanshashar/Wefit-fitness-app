package com.example.fitnessapp.stretching;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class Fwd_Lunges extends AppCompatActivity {
    private int seconds = 35;
    private boolean running = true;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching_back);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.forward_lunges);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Forward Lunges");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. Stand with your feet hip-width apart, keep your back straight, your shoulders back, and your abs tight.\n" +
                "2. Take a step forward and slowly bend both knees, until your back knee is just above the floor.\n" +
                "3. Stand back up and repeat the movement.\n" +
                "4. Alternate legs until the set is complete.\n\n"+
                "When doing lunges, keep your weight in the front heel and make sure that when youâ€™re bending your front knee, your thigh and leg form a 90-degree angle. Maintain your feet hip-width apart throughout the entire exercise, donâ€™t put one foot in front of the other. Breathe in as you lunge, and maintain a smooth and steady rhythm.");
        runTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }
    public void onClickStart(View view)
    {
        running = true;
    }
    public void onClickStop(View view)
    {
        running = false;
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