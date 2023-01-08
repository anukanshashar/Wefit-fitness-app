
package com.example.fitnessapp;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Next_Round extends AppCompatActivity {
    Animation down,up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_round);

        TextView next = findViewById(R.id.next);
        up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        next.setAnimation(up);

        TextView round = findViewById(R.id.round);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        round.setAnimation(down);

        runTimer();
    }
    private int seconds = 5;
    private boolean running = true;

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
