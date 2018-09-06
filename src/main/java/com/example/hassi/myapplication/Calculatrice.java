package com.example.hassi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculatrice extends AppCompatActivity {
Button b,b2;
    android.support.design.widget.FloatingActionButton ret3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
        ret3=(android.support.design.widget.FloatingActionButton) findViewById(R.id.retour3);
        b=(Button) findViewById(R.id.button7);
        b2=(Button) findViewById(R.id.button6);


        ret3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r= new Intent(Calculatrice.this,Gym.class);
                startActivity(r);
            }});
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(getApplicationContext(),imc.class);
                    startActivity(intent);

                }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),img.class);
                startActivity(intent);

            }

        });
    }
}
