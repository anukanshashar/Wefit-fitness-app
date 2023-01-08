package com.example.fitnessapp.areas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.R;
import com.example.fitnessapp.stretching.Arms_roll;
import com.example.fitnessapp.stretching.Arms_stretch;
import com.example.fitnessapp.stretching.CHild_Pose;
import com.example.fitnessapp.stretching.Calf_Stretch;
import com.example.fitnessapp.stretching.Cat;
import com.example.fitnessapp.stretching.Cobra_Pose;
import com.example.fitnessapp.stretching.Cow;
import com.example.fitnessapp.stretching.Fwd_Lunges;
import com.example.fitnessapp.stretching.Hip_Roll;
import com.example.fitnessapp.stretching.Jogging;
import com.example.fitnessapp.stretching.Knee_Up;
import com.example.fitnessapp.stretching.Knee_to_CHest;
import com.example.fitnessapp.stretching.Leg_Fwd_Swing;
import com.example.fitnessapp.stretching.Leg_Side_Swing;
import com.example.fitnessapp.stretching.Neck_Bwd;
import com.example.fitnessapp.stretching.Neck_Side;
import com.example.fitnessapp.stretching.Neck_fwd;
import com.example.fitnessapp.stretching.Ninety_deg_fwd_bend;
import com.example.fitnessapp.stretching.Quad_Stretch;
import com.example.fitnessapp.stretching.Shoulder_Roll;
import com.example.fitnessapp.stretching.Side_Twist;
import com.example.fitnessapp.stretching.Toe_Stretch;
import com.example.fitnessapp.stretching.Wrist_Stretch;

public class Stretching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);
        Button start = (Button) findViewById(R.id.start1);
        Button start1 = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_pre_worout();
            }
        });
        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_post_worout();
            }
        });
    }

    private void open_post_worout() {
        Intent intent = new Intent(this, Toe_Stretch.class);
        startActivityForResult(intent,12);
    }

    private void open_pre_worout() {
            Intent intent = new Intent(this, Neck_Side.class);
            startActivityForResult(intent,2);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2){
            Intent intent = new Intent(this, Neck_fwd.class);
            startActivityForResult(intent,3);
        }

        else if(requestCode == 3 ){
            Intent intent = new Intent(this, Neck_Bwd.class);
            startActivityForResult(intent,4);

        }
        else if(requestCode == 4){
            Intent intent = new Intent(this, Shoulder_Roll.class);
            startActivityForResult(intent,5);
        }
        else if(requestCode == 5){
            Intent intent = new Intent(this, Arms_roll.class);
            startActivityForResult(intent,6);
        }
        else if(requestCode == 6){
            Intent intent = new Intent(this, Hip_Roll.class);
            startActivityForResult(intent,7);
        }
        else if(requestCode == 7){
            Intent intent = new Intent(this, Leg_Fwd_Swing.class);
            startActivityForResult(intent,8);
        }
        else if(requestCode == 8){
            Intent intent = new Intent(this, Leg_Side_Swing.class);
            startActivityForResult(intent,9);
        }
        else if(requestCode == 9){
            Intent intent = new Intent(this, Knee_Up.class);
            startActivityForResult(intent,10);
        }
        else if(requestCode == 10){
            Intent intent = new Intent(this, Fwd_Lunges.class);
            startActivityForResult(intent,11);
        }
        else if(requestCode == 11){
            Intent intent = new Intent(this, Jogging.class);
            startActivity(intent);
        }
        else if(requestCode == 12){
            Intent intent = new Intent(this, Calf_Stretch.class);
            startActivityForResult(intent,13);
        }
        else if(requestCode == 13){
            Intent intent = new Intent(this, Ninety_deg_fwd_bend.class);
            startActivityForResult(intent,14);
        }else if(requestCode == 14){
            Intent intent = new Intent(this, Quad_Stretch.class);
            startActivityForResult(intent,15);
        }else if(requestCode == 15){
            Intent intent = new Intent(this, Side_Twist.class);
            startActivityForResult(intent,16);
        }
        else if(requestCode == 16){
            Intent intent = new Intent(this, Knee_to_CHest.class);
            startActivityForResult(intent,17);
        }
        else if(requestCode == 17){
            Intent intent = new Intent(this, Cat.class);
            startActivityForResult(intent,18);
        }
        else if(requestCode == 18){
            Intent intent = new Intent(this, Cow.class);
            startActivityForResult(intent,19);
        }
        else if(requestCode == 19){
            Intent intent = new Intent(this, Cobra_Pose.class);
            startActivityForResult(intent,20);
        }
        else if(requestCode == 20){
            Intent intent = new Intent(this, Wrist_Stretch.class);
            startActivityForResult(intent,21);
        }
        else if(requestCode == 21){
            Intent intent = new Intent(this, Arms_stretch.class);
            startActivityForResult(intent,22);
        }
        else if(requestCode == 22){
            Intent intent = new Intent(this, CHild_Pose.class);
            startActivity(intent);
        }

    }
}