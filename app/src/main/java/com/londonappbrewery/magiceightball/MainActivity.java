package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button guzik=(Button) findViewById(R.id.jakzyc_button);
        final ImageView kula=(ImageView) findViewById(R.id.kulka_ImageView);
        final int[] array = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

      guzik.setOnClickListener(new View.OnClickListener(){

              public void onClick(View v){

                  Random losowa= new Random();
                  int number=losowa.nextInt(5);
                  Log.d("ball","Wylosowana liczba to:"+number);

                  kula.setImageResource(array[number]);


        }
    });










    }
}
