package com.example.shinelon.hw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

/**
 * Created by Shinelon on 3/10/2019.
 */

public class melbmain extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.melbmain);

        ImageButton imageButton =findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), MainActivity.class);
                //intent.putExtra("article", 1);
                startActivity(intent);
            }
        });




    }
}
