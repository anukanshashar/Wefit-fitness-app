package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitnessapp.areas.Abs;
import com.example.fitnessapp.areas.Arms;
import com.example.fitnessapp.areas.Back;
import com.example.fitnessapp.areas.Bicep;
import com.example.fitnessapp.areas.Legs;
import com.example.fitnessapp.areas.Meditation;
import com.example.fitnessapp.areas.Shoulder;
import com.example.fitnessapp.areas.Stretching;
import com.example.fitnessapp.yoga.Ardha_Matsyendrasana;
import com.example.fitnessapp.yoga.Ardha_Uttanasana;
import com.example.fitnessapp.yoga.Balasana;
import com.example.fitnessapp.yoga.Bhadrasana;
import com.example.fitnessapp.yoga.Bhujangasana;
import com.example.fitnessapp.yoga.Matsyasana;
import com.example.fitnessapp.yoga.Paschimottanasana;
import com.example.fitnessapp.yoga.Pawanmuktasana;
import com.example.fitnessapp.yoga.Shavasana;
import com.example.fitnessapp.yoga.Trikonasana;
import com.example.fitnessapp.yoga.Utkatasana;
import com.example.fitnessapp.yoga.Vajrasana;

public class MainActivity extends AppCompatActivity {
    ImageButton arms,back,bicep,shoulder,abs,legs,stretching,yoga,meditation,food_intake,water_intake;
    int i=1,i1=1,i2=1,i3=1,i4=1,i5=1,i6=1,j1=1,j2=1,j3=1,j4=1,j5=1,j6=1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button help = (Button) findViewById(R.id.help);
        // all the buttons of Main_Activity
        arms = (ImageButton) findViewById(R.id.arms);
        back = (ImageButton) findViewById(R.id.back);
        bicep = (ImageButton) findViewById(R.id.bicep);
        shoulder = (ImageButton) findViewById(R.id.shoulder);
        legs = (ImageButton) findViewById(R.id.legs);
        abs = (ImageButton) findViewById(R.id.abs);
        stretching = (ImageButton) findViewById(R.id.streching);
        yoga = (ImageButton) findViewById(R.id.yoga);
        meditation = (ImageButton) findViewById(R.id.meditation);
        food_intake = (ImageButton) findViewById((R.id.food));
        water_intake = (ImageButton) findViewById(R.id.water);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Info.class);
                startActivity(intent);
            }
        });
        // all the listeners of Main_Activity
        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArms();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });
        bicep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBicep();

            }
        });
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoulder();
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLegs();
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbs();
            }
        });
        stretching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStretching();
            }
        });
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoga();
            }
        });
        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeditation();
            }
        });
        food_intake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood();
            }
        });
        water_intake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWater();
            }
        });
    }
    private void openWater(){
        Intent intent = new Intent(this, Water_Intake.class);
        startActivity(intent);
    }

    private void openFood() {
        Intent intent = new Intent(this,Food_Intake.class);
        startActivity(intent);
    }

    private void openArms() {

        Intent intent = new Intent(this, Arms.class);
        if(i1==1||i1==6||i1==11||i1==16||i1==21||i1==26) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",j1);
            intent.putExtras(bundle);
            j1++;}
        if(i1==2||i1==3||i1==4||i1==5) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",1);
            intent.putExtras(bundle);
        }
        if(i1==7||i1==8||i1==9||i1==10) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",2);
            intent.putExtras(bundle);
        }
        if(i1==12||i1==13||i1==14||i1==15) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",3);
            intent.putExtras(bundle);
        }
        if(i1==17||i1==18||i1==19||i1==20) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",4);
            intent.putExtras(bundle);
        }
        if(i1==22||i1==23||i1==24||i1==25) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",5);
            intent.putExtras(bundle);
        }
        if(i1==27||i1==28||i1==29||i1==30) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",6);
            intent.putExtras(bundle);
        }
        ++i1;
        startActivity(intent);

    }

    private void openBack() {
        Intent intent = new Intent(this, Back.class);

        if(i2==1||i2==6||i2==11||i2==16||i2==21||i2==26) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",j2);
            intent.putExtras(bundle);
            j2++;}
        if(i2==2||i2==3||i2==4||i2==5) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",1);
            intent.putExtras(bundle);
            }
        if(i2==7||i2==8||i2==9||i2==10) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",2);
            intent.putExtras(bundle);
        }
        if(i2==12||i2==13||i2==14||i2==15) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",3);
            intent.putExtras(bundle);
        }
        if(i2==17||i2==18||i2==19||i2==20) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",4);
            intent.putExtras(bundle);
        }
        if(i2==22||i2==23||i2==24||i2==25) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",5);
            intent.putExtras(bundle);
        }
        if(i2==27||i2==28||i2==29||i2==30) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",6);
            intent.putExtras(bundle);
        }

        i2++;
        startActivity(intent);
    }

    private void openBicep() {
        Intent intent = new Intent(this, Bicep.class);
        if(i3==1||i3==6||i3==11||i3==16||i3==21||i3==26) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",j3);
            intent.putExtras(bundle);
            j3++;}
        if(i3==2||i3==3||i3==4||i3==5) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",1);
            intent.putExtras(bundle);
        }
        if(i3==7||i3==8||i3==9||i3==10) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",2);
            intent.putExtras(bundle);
        }
        if(i3==12||i3==13||i3==14||i3==15) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",3);
            intent.putExtras(bundle);
        }
        if(i3==17||i3==18||i3==19||i3==20) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",4);
            intent.putExtras(bundle);
        }
        if(i3==22||i3==23||i3==24||i3==25) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",5);
            intent.putExtras(bundle);
        }
        if(i3==27||i3==28||i3==29||i3==30) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",6);
            intent.putExtras(bundle);
        }
        ++i3;
        startActivity(intent);

    }

    private void openShoulder(){
        Intent intent = new Intent(this, Shoulder.class);
        if(i4==1||i4==6||i4==11||i4==16||i4==21||i4==26) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",j4);
            intent.putExtras(bundle);
            j4++;}
        if(i4==2||i4==3||i4==4||i4==5) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",1);
            intent.putExtras(bundle);
        }
        if(i4==7||i4==8||i4==9||i4==10) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",2);
            intent.putExtras(bundle);
        }
        if(i4==12||i4==13||i4==14||i4==15) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",3);
            intent.putExtras(bundle);
        }
        if(i4==17||i4==18||i4==19||i4==20) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",4);
            intent.putExtras(bundle);
        }
        if(i4==22||i4==23||i4==24||i4==25) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",5);
            intent.putExtras(bundle);
        }
        if(i4==27||i4==28||i4==29||i4==30) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",6);
            intent.putExtras(bundle);
        }
        ++i4;
        startActivity(intent);

    }

    private void openLegs(){
        Intent intent = new Intent(this, Legs.class);
        if(i5==1||i5==6||i5==11||i5==16||i5==21||i5==26) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",j5);
            intent.putExtras(bundle);
            j5++;}
        if(i5==2||i5==3||i5==4||i5==5) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",1);
            intent.putExtras(bundle);
        }
        if(i5==7||i5==8||i5==9||i5==10) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",2);
            intent.putExtras(bundle);
        }
        if(i5==12||i5==13||i5==14||i5==15) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",3);
            intent.putExtras(bundle);
        }
        if(i5==17||i5==18||i5==19||i5==20) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",4);
            intent.putExtras(bundle);
        }
        if(i5==22||i5==23||i5==24||i5==25) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",5);
            intent.putExtras(bundle);
        }
        if(i5==27||i5==28||i5==29||i5==30) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",6);
            intent.putExtras(bundle);
        }
        ++i5;
        startActivity(intent);

    }

    private void openAbs(){
        Intent intent = new Intent(this, Abs.class);
        if(i6==1||i6==6||i6==11||i6==16||i6==21||i6==26) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",j6);
            intent.putExtras(bundle);
            j6++;}
        if(i6==2||i6==3||i6==4||i6==5) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",1);
            intent.putExtras(bundle);
        }
        if(i6==7||i6==8||i6==9||i6==10) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",2);
            intent.putExtras(bundle);
        }
        if(i6==12||i6==13||i6==14||i6==15) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",3);
            intent.putExtras(bundle);
        }
        if(i6==17||i6==18||i6==19||i6==20) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",4);
            intent.putExtras(bundle);
        }
        if(i6==22||i6==23||i6==24||i6==25) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",5);
            intent.putExtras(bundle);
        }
        if(i6==27||i6==28||i6==29||i6==30) {
            Bundle bundle = new Bundle();
            bundle.putInt("times",6);
            intent.putExtras(bundle);
        }
        ++i6;
        startActivity(intent);

    }

    private void openStretching(){
        Intent intent = new Intent(this, Stretching.class);
        startActivity(intent);

    }

    private void openYoga() {
        Intent intent = new Intent(this, Vajrasana.class);
        startActivityForResult(intent,2);
    }

    private void openMeditation() {
        Intent intent = new Intent(this, Meditation.class);
        startActivity(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            Intent intent = new Intent(this, Bhadrasana.class);
            startActivityForResult(intent, 3);
        } else if (requestCode == 3) {
            Intent intent = new Intent(this, Bhujangasana.class);
            startActivityForResult(intent, 4);

        } else if (requestCode == 4) {
            Intent intent = new Intent(this, Ardha_Matsyendrasana.class);
            startActivityForResult(intent, 5);
        } else if (requestCode == 5) {
            Intent intent = new Intent(this, Shavasana.class);
            startActivityForResult(intent, 6);
        }
        else if(requestCode == 6){
            Intent intent = new Intent(this, Matsyasana.class);
            startActivityForResult(intent,7);
        }
        else if(requestCode == 7){
            Intent intent = new Intent(this, Paschimottanasana.class);
            startActivityForResult(intent,8);
        }
        else if(requestCode == 8){
            Intent intent = new Intent(this, Trikonasana.class);
            startActivityForResult(intent,9);
        }
        else if(requestCode == 9){
            Intent intent = new Intent(this, Utkatasana.class);
            startActivityForResult(intent,10);
        }
        else if(requestCode == 10){
            Intent intent = new Intent(this, Balasana.class);
            startActivityForResult(intent,11);
        }
        else if(requestCode == 11){
            Intent intent = new Intent(this, Pawanmuktasana.class);
            startActivityForResult(intent,12);
        }
        else if(requestCode == 12){
            Intent intent = new Intent(this, Ardha_Uttanasana.class);
            startActivity(intent);
        }
    }
}
