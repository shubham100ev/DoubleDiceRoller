package com.example.doublediceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView dice1, dice2;
    ImageButton startDice;
    private Random randomNum1=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1 = findViewById(R.id.first_dice);
        dice2 = findViewById(R.id.second_dice);
        startDice = findViewById(R.id.start_dice);
        startDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice1();
                rollDice2();
            }
        });
    }

    private void rollDice1() {
        int num = randomNum1.nextInt(6) + 1;
        switch (num) {
            case 1:
                dice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice1.setImageResource(R.drawable.dice6);
                break;

        }
    }
    private void rollDice2() {
        int num = randomNum1.nextInt(6) + 1;
        switch (num) {
            case 1:
                dice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice2.setImageResource(R.drawable.dice6);
                break;

        }
    }
}