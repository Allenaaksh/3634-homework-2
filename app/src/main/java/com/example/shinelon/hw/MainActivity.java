package com.example.shinelon.hw;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
     Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView1 = findViewById(R.id.time1);
        textView2 = findViewById(R.id.time2);
        textView3 = findViewById(R.id.time3);
        textView4 = findViewById(R.id.time4);
        textView5 = findViewById(R.id.time5);
        button = findViewById(R.id.update1);
        button = findViewById(R.id.update2);
        button = findViewById(R.id.update3);
        button = findViewById(R.id.update4);
        button = findViewById(R.id.update5);
       // button = findViewById(R.id.update1);
       // button = findViewById(R.id.update1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                DateFormat dateFormat =DateFormat.getDateTimeInstance();
                String string = dateFormat.format(dateFormat);

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" hh:mm:ss a");
                String dateTime = simpleDateFormat.format(calendar.getTime());
                textView1.setText(string);
                textView2.setText(dateTime);
                textView3.setText(dateTime);
                textView4.setText(dateTime);
                textView5.setText(dateTime);




            }
            });
    }
        }








