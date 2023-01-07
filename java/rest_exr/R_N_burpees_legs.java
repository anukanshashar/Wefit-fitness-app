package com.example.fitnessapp.rest_exc;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class R_N_burpees_legs extends AppCompatActivity {
    private int seconds = 15;
    private boolean running = true;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteen_rest);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.legs_exersices_burpee);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Burpees");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1. Start in a squat position with your knees bent, back straight, and your feet about shoulder-width apart.\n" +
                "2. Lower your hands to the floor in front of you so theyâ€™re just inside your feet.\n" +
                "3. With your weight on your hands, kick your feet back so youâ€™re on your hands and toes, and in a pushup position.\n" +
                "4. Keeping your body straight from head to heels, do one pushup. Remember not to let your back sag or to stick your butt in the air.\n" +
                "5. Do a frog kick by jumping your feet back to their starting position.\n" +
                "6. Stand and reach your arms over your head.\n" +
                "7. Jump quickly into the air so you land back where you started.\n" +
                "8. As soon as you land with knees bent, get into a squat position and do another repetition.");
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