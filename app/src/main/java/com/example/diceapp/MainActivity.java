package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button b_roll;

    ImageView dice6;

    Random r;

    int rolledNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_roll = (Button) findViewById(R.id.b_roll);

        dice6 = (ImageView) findViewById(R.id.dice6);

        r = new Random();


        b_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolledNumber = r.nextInt(6)+1;

                if(rolledNumber == 1){
                    dice6.setImageResource(R.drawable.a);
                }
                else if(rolledNumber == 2){
                    dice6.setImageResource(R.drawable.b);
                }
                else if(rolledNumber == 3){
                    dice6.setImageResource(R.drawable.c);
                }
                else if(rolledNumber == 4){
                    dice6.setImageResource(R.drawable.d);
                }
                else if(rolledNumber == 5){
                    dice6.setImageResource(R.drawable.e);
                }
                else if(rolledNumber == 6){
                    dice6.setImageResource(R.drawable.f);
                }

            }
        });


    }
}
