package com.example.fitnessapp.start;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class Start_Arms_Classic_Push_Ups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        GifImageView gif = (GifImageView) findViewById(R.id.exc);
        gif.setBackgroundResource(R.drawable.exersice_tricep_1);
        TextView name =  (TextView) findViewById(R.id.exc_name);
        name.setText("Classic Push Ups");
        TextView instruction =  (TextView) findViewById(R.id.instructions);
        instruction.setText("1.Start with your body in a straight line and your hands slightly wider than shoulder-width apart. Keep your toes and balls of the feet touching the floor.\n"+" 2. Bring one knee up toward the center of your stomach.\n" +
                "3. Switch legs, pulling one knee out and bringing the other knee in.\n" +
                "4. Keep your hips down and run your knees in and out as far and as fast as you can.\n 4.Alternate inhaling and exhaling with each leg change."+"5. Maintain a plank position during the entire exercise, keep your core engaged, your hips low and your body in a straight line.");
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
