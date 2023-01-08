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
import com.example.fitnessapp.indiviual_exc.Bicep_Extensions;
import com.example.fitnessapp.indiviual_exc.Dumbell_curls;
import com.example.fitnessapp.indiviual_exc.Inclined_Chin_Ups;
import com.example.fitnessapp.indiviual_exc.Shoulder_Press;
import com.example.fitnessapp.indiviual_exc.Side_Cable_Curls;
import com.example.fitnessapp.indiviual_exc.Straight_Cable_Curls;
import com.example.fitnessapp.rest_exc.R_N_bicep_extension;
import com.example.fitnessapp.rest_exc.R_N_inclined_chin_ups;
import com.example.fitnessapp.rest_exc.R_N_shoulder_press;
import com.example.fitnessapp.rest_exc.R_N_side_cable_curls;
import com.example.fitnessapp.rest_exc.R_N_straight_cable_curls;
import com.example.fitnessapp.start.Start_Bicep_Dumbell_Curls;

public class Bicep extends AppCompatActivity {
    int i=0,j=1;
    int temp1 ;
    int temp3=1;
    int temp;
    int times;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep);
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
        Intent intent = new Intent(this, Start_Bicep_Dumbell_Curls.class);
        startActivityForResult(intent,2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2 && i<temp){
            Intent intent = new Intent(this, Dumbell_curls.class);
            startActivityForResult(intent,3);
        }

        else if(requestCode == 3 ){
            Intent intent = new Intent(this, R_N_bicep_extension.class);
            startActivityForResult(intent,4);

        }
        else if(requestCode == 4){
            Intent intent = new Intent(this, Bicep_Extensions.class);
            startActivityForResult(intent,5);
        }
        else if(requestCode == 5){
            Intent intent = new Intent(this, R_N_shoulder_press.class);
            startActivityForResult(intent,6);
        }
        else if(requestCode == 6){
            Intent intent = new Intent(this, Shoulder_Press.class);
            startActivityForResult(intent,7);
        }
        else if(requestCode == 7){
            Intent intent = new Intent(this, R_N_straight_cable_curls.class);
            startActivityForResult(intent,8);
        }
        else if(requestCode == 8){
            Intent intent = new Intent(this, Straight_Cable_Curls.class);
            startActivityForResult(intent,9);
        }
        else if(requestCode == 9){
            Intent intent = new Intent(this, R_N_side_cable_curls.class);
            startActivityForResult(intent,10);
        }
        else if(requestCode == 10){
            Intent intent = new Intent(this, Side_Cable_Curls.class);
            startActivityForResult(intent,11);
        }
        else if(requestCode == 11){
            Intent intent = new Intent(this, R_N_inclined_chin_ups.class);
            startActivityForResult(intent,12);
        }
        else if(requestCode == 12){
            Intent intent = new Intent(this, Inclined_Chin_Ups.class);
            startActivityForResult(intent,13);
        }
        else if(requestCode == 13 && i<temp1){
            i++;
            Intent intent = new Intent(this, Next_Round.class);
            startActivityForResult(intent,14);
        }
        else if(requestCode == 14 ){
            Intent intent = new Intent(this, Start_Bicep_Dumbell_Curls.class);
            startActivityForResult(intent,2);
        }
    }
}