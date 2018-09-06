package com.example.hassi.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.id;
import static android.R.attr.parentActivityName;

public class exercice extends AppCompatActivity {
    ListView mListeView;
    ArrayList<Integer> idImage;
    ArrayList<String> nameList;
    MyAdapter myAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice);

        mListeView=(ListView) findViewById(R.id.ListeView);
        idImage=new ArrayList<>();
        nameList=new ArrayList<>();
        idImage=getListId();
        nameList=getNameList();
        myAdapter=new MyAdapter(exercice.this,idImage,nameList);
        mListeView.setAdapter(myAdapter);

        mListeView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent= new Intent(getApplicationContext(),Epaul.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent= new Intent(getApplicationContext(),Pictreau.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent= new Intent(getApplicationContext(),Dos.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent= new Intent(getApplicationContext(),Triceps.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent= new Intent(getApplicationContext(),Biceps.class);
                    startActivity(intent);
                }

                if(i==5){
                    Intent intent= new Intent(getApplicationContext(),Abdo.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent= new Intent(getApplicationContext(),Jambe.class);
                    startActivity(intent);
                }

            }
        });

    }

    public ArrayList<Integer> getListId() {
        idImage=new ArrayList<>();
        idImage.add(R.drawable.m71);
        idImage.add(R.drawable.m41);
        idImage.add(R.drawable.m11);
        idImage.add(R.drawable.m81);
        idImage.add(R.drawable.m21);
        idImage.add(R.drawable.m01);
        idImage.add(R.drawable.m61);
        return idImage;
    }

    public ArrayList<String> getNameList() {
        nameList=new ArrayList<>();
        nameList.add("Epaule");
        nameList.add("Pictreau");
        nameList.add("Dos");
        nameList.add("Triceps");
        nameList.add("Biceps");
        nameList.add("Abdos");
        nameList.add("Jambe");
        return nameList;
    }


}
