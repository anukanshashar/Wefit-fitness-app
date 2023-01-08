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
 import com.example.fitnessapp.indiviual_exc.Bicycle_crunches;
 import com.example.fitnessapp.indiviual_exc.Leg_raise;
 import com.example.fitnessapp.indiviual_exc.Mountain_climbers;
 import com.example.fitnessapp.indiviual_exc.Plank_leg_lift;
 import com.example.fitnessapp.indiviual_exc.Sit_ups;
 import com.example.fitnessapp.indiviual_exc.Toe_touch;
 import com.example.fitnessapp.rest_exc.R_N_bicycle_crunches;
 import com.example.fitnessapp.rest_exc.R_N_leg_raise;
 import com.example.fitnessapp.rest_exc.R_N_plank_leglift;
 import com.example.fitnessapp.rest_exc.R_N_sit_ups;
 import com.example.fitnessapp.rest_exc.R_N_toe_touches;
 import com.example.fitnessapp.start.Start_Abs_Mountain_Climbers;

 public class Abs extends AppCompatActivity {
     int i=0;
     int temp1 ;
     int temp;
     int times;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_abs);
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
        Intent intent = new Intent(this, Start_Abs_Mountain_Climbers.class);
        startActivityForResult(intent,2);

    }

     @Override
     protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
         super.onActivityResult(requestCode, resultCode, data);
             if(requestCode==2){
                 Intent intent = new Intent(this, Mountain_climbers.class);
                 startActivityForResult(intent,3);
             }

            else if(requestCode == 3 ){
                 Intent intent = new Intent(this, R_N_sit_ups.class);
                 startActivityForResult(intent,4);

             }
            else if(requestCode == 4){
                 Intent intent = new Intent(this, Sit_ups.class);
                 startActivityForResult(intent,5);
             }
             else if(requestCode == 5){
                 Intent intent = new Intent(this, R_N_bicycle_crunches.class);
                 startActivityForResult(intent,6);
             }
             else if(requestCode == 6){
                 Intent intent = new Intent(this, Bicycle_crunches.class);
                 startActivityForResult(intent,7);
             }
             else if(requestCode == 7){
                 Intent intent = new Intent(this, R_N_leg_raise.class);
                 startActivityForResult(intent,8);
             }
             else if(requestCode == 8){
                 Intent intent = new Intent(this, Leg_raise.class);
                 startActivityForResult(intent,9);
             }
             else if(requestCode == 9){
                 Intent intent = new Intent(this, R_N_toe_touches.class);
                 startActivityForResult(intent,10);
             }
             else if(requestCode == 10){
                 Intent intent = new Intent(this, Toe_touch.class);
                 startActivityForResult(intent,11);
             }
             else if(requestCode == 11){
                 Intent intent = new Intent(this, R_N_plank_leglift.class);
                 startActivityForResult(intent,12);
             }
             else if(requestCode == 12){
                 Intent intent = new Intent(this, Plank_leg_lift.class);
                 startActivityForResult(intent,13);
             }
             else if(requestCode == 13 && i<temp1){
                 i++;
                 Intent intent = new Intent(this, Next_Round.class);
                 startActivityForResult(intent,14);
             }
             else if(requestCode == 14 ){
                 Intent intent = new Intent(this, Start_Abs_Mountain_Climbers.class);
                 startActivityForResult(intent,2);
             }
         }
     }
