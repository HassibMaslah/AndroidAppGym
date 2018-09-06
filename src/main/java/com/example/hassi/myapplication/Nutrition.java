package com.example.hassi.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Nutrition extends AppCompatActivity {
    android.support.design.widget.FloatingActionButton ret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nutrition);
        ret=(android.support.design.widget.FloatingActionButton) findViewById(R.id.retour);

        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r3= new Intent(Nutrition.this,Gym.class);
                startActivity(r3);
            }
        });
    }
    public void Browser1 (View view){
        Intent b=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fitadium.com/fitipedia/alimentation/programmes/"));
        startActivity(b);
    }
    public void Browser2 (View view){
       /* Intent b2=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fitadium.com/fitipedia/alimentation/supplements/"));
        startActivity(b2);*/
        Intent b2= new Intent(Nutrition.this,Alimentation.class);
        startActivity(b2);
    }
}
