package com.example.hassi.myapplication;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class img extends AppCompatActivity {
EditText imc,age ;
    Button b2;
    RadioButton h,f;
    TextView res,resDesc;
    float s;
    boolean test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);
        imc=(EditText) findViewById(R.id.Imc);
        age=(EditText) findViewById(R.id.Age);
        b2=(Button) findViewById(R.id.calImg);
        h=(RadioButton) findViewById(R.id.homme);
        f=(RadioButton) findViewById(R.id.femme);
        res=(TextView) findViewById(R.id.resImg);
        resDesc=(TextView) findViewById(R.id.resDesc);
        CreatRadio();
        CreatRadio2();

        imc.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b) {
                if(TextUtils.isEmpty(imc.getText().toString())){imc.setError("Champs IMC est Vide,Entrer Votre IMC");}

            }
        });

        age.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b) {
                if(TextUtils.isEmpty(age.getText().toString())){age.setError("Champs Age est Vide,Entrer Votre Age");}

            }
        });

       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String v1 = imc.getText().toString();
                String v2 = age.getText().toString();
                float i = Float.parseFloat(v1);
                float a = Float.parseFloat(v2);
                float sr = 0;

                if (i>0&&a>0){
                sr=( 1.2f*i+ (0.23f * a) - s - 5.4f);
                    java.text.DecimalFormat df = new java.text.DecimalFormat("0.#");
                res.setText("l IMG est : " + df.format(sr)+"%");}
                else {Context context = getApplicationContext();
                    CharSequence text = "Les Champs doivent étre Positive";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();}

                if (s==0f) {

                    if (sr <= 25f)
                        resDesc.setText("Interprétation de l’IMG: Personne trop maigre");
                    if (sr > 25f && s <= 30f)
                        resDesc.setText("Interprétation de l’IMG: Personne normale");
                    if (sr > 30f )
                        resDesc.setText("Interprétation de l’IMG: Personne ayant trop de graisse");
                }else{
                    if (sr <= 15f)
                        resDesc.setText("Interprétation de l’IMG: Personne trop maigre");
                    if (sr > 15f && s <= 20f)
                        resDesc.setText("Interprétation de l’IMG: Personne normale");
                    if (sr > 20f )
                        resDesc.setText("Interprétation de l’IMG: Personne ayant trop de graisse");
                }
           }
   });
}
    private void CreatRadio (){
        RadioButton rb=(RadioButton) findViewById(R.id.femme);
        RadioGroup group= (RadioGroup) findViewById(R.id.RdGrp);

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(img.this,"You clicked Femme",Toast.LENGTH_SHORT).show();
                 s=0;
            }
        });

    }
    private void CreatRadio2 (){
        RadioButton rb=(RadioButton) findViewById(R.id.homme);
        RadioGroup group= (RadioGroup) findViewById(R.id.RdGrp);

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(img.this,"You clicked Homme",Toast.LENGTH_SHORT).show();
                s=10.83f * 1f;
            }
        });

    }



}