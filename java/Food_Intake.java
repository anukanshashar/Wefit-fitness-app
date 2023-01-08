package com.example.fitnessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Food_Intake extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_intake);
        Button breakfast = (Button) findViewById(R.id.breakfast);
        Button lunch = (Button) findViewById(R.id.lunch);
        Button dinner = (Button) findViewById(R.id.dinner);

        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                breakfast();
            }
        });
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lunch();
            }
        });
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dinner();
            }
        });
    }

    public void lunch() {
        RelativeLayout image1 = (RelativeLayout) findViewById(R.id.image1);
        image1.setBackground(getDrawable(R.drawable.salad) );
        RelativeLayout image2 = (RelativeLayout) findViewById(R.id.image2);
        image2.setBackground(getDrawable(R.drawable.lunch) );
        TextView info = (TextView) findViewById(R.id.info);
        info.setText("You always have to eat your lunch on 2 plates (Plate 1 & Plate 2). What does this mean now? This means that first, you have to finish plate 1, then you have to eat plate 2.\n"+
                "\nPlate 1: Your plate 1 should have at least 4 types of vegetables like carrot, tomato, radish, and cucumber. Which you can eat raw."
        );
        TextView info1 = (TextView) findViewById(R.id.info1);
        info1.setText("\nAgain the question comes to mind how many raw vegetables to eat? So the answer is –\n" +
                "\n" +
                "The minimum amount of raw vegetables eaten – Your Body Weight in kg × 5 = …gms\n" +
                "\n" +
                "For example – Let’s say your weight is 60 Kg. So 60 x 5 = 300gms of raw vegetables have to be eaten.\n" +
                "\n" +
                "Plate 2: In this, you have to eat home-cooked vegetarian food in which there is little salt and oil.\n"+
                "Does the question then come how much to eat? So the answer is, to eat as much as you can.");
    }

    private void breakfast() {
        RelativeLayout image1 = (RelativeLayout) findViewById(R.id.image1);
        image1.setBackground(getDrawable(R.drawable.frui) );
        TextView info = (TextView) findViewById(R.id.info);
        info.setText("By 12 o’clock you have to eat only 3 to 4 types of fruits like – Mango, Grapes, Banana, etc.\n"+
                "Now the question comes to mind how much fruit to eat? so the answer is –\n" +
                "\n" +
                "The minimum amount of fruit intake – Your Body Weight in kg × 10 = …gms\n" );
        TextView info1 = (TextView) findViewById(R.id.info1);
        info1.setText("\nFor example – Let’s say your weight is 60 Kg. So 60 x 10 = 600gms fruit you have to eat before 12 noon.");
    }
    private void dinner(){
        RelativeLayout image1 = (RelativeLayout) findViewById(R.id.image1);
        image1.setBackground(getDrawable(R.drawable.salad) );
        RelativeLayout image2 = (RelativeLayout) findViewById(R.id.image2);
        image2.setBackground(getDrawable(R.drawable.lunch) );
        TextView info = (TextView) findViewById(R.id.info);
        info.setText("You always have to eat your lunch on 2 plates (Plate 1 & Plate 2). What does this mean now? This means that first, you have to finish plate 1, then you have to eat plate 2.\n"+
                "\nPlate 1: Your plate 1 should have at least 4 types of vegetables like carrot, tomato, radish, and cucumber. Which you can eat raw."
        );
        TextView info1 = (TextView) findViewById(R.id.info1);
        info1.setText("\nAgain the question comes to mind how many raw vegetables to eat? So the answer is –\n" +
                "\n" +
                "The minimum amount of raw vegetables eaten – Your Body Weight in kg × 5 = …gms\n" +
                "\n" +
                "For example – Let’s say your weight is 60 Kg. So 60 x 5 = 300gms of raw vegetables have to be eaten.\n" +
                "\n" +
                "Plate 2: In this, you have to eat home-cooked vegetarian food in which there is little salt and oil.\n"+
                "Does the question then come how much to eat? So the answer is, to eat as much as you can.");
        TextView info2 = (TextView) findViewById(R.id.info2);
        info2.setText("Remember that we should try to finish the dinner by 7 pm.");
    }



}

