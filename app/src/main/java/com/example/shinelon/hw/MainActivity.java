package com.example.shinelon.hw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextClock clock1;
    TextClock clock2;
    TextClock clock3;
    TextClock clock4;
    TextClock clock5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clock1= findViewById(R.id.clock1) ;
        clock2= findViewById(R.id.clock2) ;
        clock3= findViewById(R.id.clock3) ;
        clock4= findViewById(R.id.clock4) ;
        clock5= findViewById(R.id.clock5) ;
        Button buttonswitch1 = findViewById(R.id.switch1);
        Button buttonswitch2 = findViewById(R.id.switch2);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);


        TextView textView1 =findViewById(R.id.move1);


        buttonswitch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clock1.setFormat12Hour("HH:mm:ss");
                clock2.setFormat12Hour("HH:mm:ss");
                clock3.setFormat12Hour("HH:mm:ss");
                clock4.setFormat12Hour("HH:mm:ss");
                clock5.setFormat12Hour("HH:mm:ss");


            }
        });

        buttonswitch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                clock1.setFormat12Hour("hh:mm:ss a");
                clock2.setFormat12Hour("hh:mm:ss a");
                clock3.setFormat12Hour("hh:mm:ss a");
                clock4.setFormat12Hour("hh:mm:ss a");
                clock5.setFormat12Hour("hh:mm:ss a");

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), beijingmain.class);
                //intent.putExtra("article", 1);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), brisbenmain.class);
                //intent.putExtra("article", 1);
                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), melbmain.class);
                //intent.putExtra("article", 1);
                startActivity(intent);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), sydneymain.class);
                //intent.putExtra("article", 1);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), tykomain.class);
                //intent.putExtra("article", 1);
                startActivity(intent);

            }
        });









    }
}








