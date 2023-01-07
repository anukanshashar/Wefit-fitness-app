package com.example.fitnessapp.indiviual_exc;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class Burpees extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forty_five_exc);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.legs_exersices_burpee);
        TextView name = (TextView) findViewById(R.id.exc_name);
        name.setText("Burpees");
        runTimer();
    }
    private int seconds = 45;
    private boolean running = true;
    private void runTimer()
    {
        final TextView timeView = (TextView)findViewById(R.id.timer);
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
                if (seconds == 0){
                    finish();
                }
                handler.postDelayed(this, 1000);
            }

        });

    }
}
