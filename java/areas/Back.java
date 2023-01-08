package com.example.fitnessapp.areas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.Next_Round;
import com.example.fitnessapp.R;
import com.example.fitnessapp.indiviual_exc.Alternative_toe_touch;
import com.example.fitnessapp.indiviual_exc.Bridge;
import com.example.fitnessapp.indiviual_exc.Leg_raise;
import com.example.fitnessapp.indiviual_exc.Plank_leg_lift;
import com.example.fitnessapp.indiviual_exc.Standing_wind_mill;
import com.example.fitnessapp.rest_exc.R_N_alternative_toe_touch;
import com.example.fitnessapp.rest_exc.R_N_bridge;
import com.example.fitnessapp.rest_exc.R_N_plank_leglift;
import com.example.fitnessapp.rest_exc.R_N_standing_wind_mill;
import com.example.fitnessapp.start.Start_Back_Leg_Lifts;

public class Back extends AppCompatActivity {
    int i=0,j=1;
    int temp1 ;
    int temp3=1;
    int temp;
    int times;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        //set function---
        times= getIntent().getIntExtra("times",0);
        TextView temp2 = (TextView) findViewById(R.id.num);
        temp2.setText("" + times);
        temp = times;
        temp1 = temp -1;

        //buttons---
        Button add = (Button) findViewById(R.id.increase);
        Button subtract = (Button) findViewById(R.id.decrease);
        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtract();
            }
        });
    }

    // to add and subtract the number of sets
    private void add() {
        temp += 1;
        temp1 = temp-1;
        change(temp);
    }

    private void subtract() {
        temp -= 1;
        temp1 = temp-1;
        change(temp);
    }

    private void change(int num) {
        if(num>6||num<=0){
            Toast.makeText(this, "You have entered an invalid set number!", Toast.LENGTH_LONG).show();
        }
        else{
            TextView temp2 = (TextView) findViewById(R.id.num);
            temp2.setText("" + num);
        }
    }
    private void start() {
        Intent intent = new Intent(this, Start_Back_Leg_Lifts.class);
        startActivityForResult(intent,2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2 && i<temp){
            Intent intent = new Intent(this, Leg_raise.class);
            startActivityForResult(intent,3);
        }

        else if(requestCode == 3 ){
            Intent intent = new Intent(this, R_N_alternative_toe_touch.class);
            startActivityForResult(intent,4);

        }
        else if(requestCode == 4){
            Intent intent = new Intent(this, Alternative_toe_touch.class);
            startActivityForResult(intent,5);
        }
        else if(requestCode == 5){
            Intent intent = new Intent(this, R_N_plank_leglift.class);
            startActivityForResult(intent,6);
        }
        else if(requestCode == 6){
            Intent intent = new Intent(this, Plank_leg_lift.class);
            startActivityForResult(intent,7);
        }
        else if(requestCode == 7){
            Intent intent = new Intent(this, R_N_bridge.class);
            startActivityForResult(intent,8);
        }
        else if(requestCode == 8){
            Intent intent = new Intent(this, Bridge.class);
            startActivityForResult(intent,9);
        }
        else if(requestCode == 9){
            Intent intent = new Intent(this, R_N_standing_wind_mill.class);
            startActivityForResult(intent,10);
        }
        else if(requestCode == 10){
            Intent intent = new Intent(this, Standing_wind_mill.class);
            startActivityForResult(intent,11);
        }

        else if(requestCode == 11 && i<temp1){
            i++;
            Intent intent = new Intent(this, Next_Round.class);
            startActivityForResult(intent,14);
        }
        else if(requestCode == 14 ){
            Intent intent = new Intent(this, Start_Back_Leg_Lifts.class);
            startActivityForResult(intent,2);
        }
    }
}