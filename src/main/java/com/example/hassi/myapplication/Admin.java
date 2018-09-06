package com.example.hassi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin extends AppCompatActivity {
Button Bt_Exercice,Bt_MAJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Bt_Exercice=(Button) findViewById(R.id.buttonGerer);
        Bt_MAJ=(Button) findViewById(R.id.buttonGerer);

        Bt_Exercice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),AjoutExercice.class);
                startActivity(intent);
            }
        });
        Bt_MAJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),MiseAjour.class);
                startActivity(intent);
            }
        });
    }
}
