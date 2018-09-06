package com.example.hassi.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigDecimal;

public class imc extends AppCompatActivity {
    EditText editText4,editText5;
    TextView res,etat;
    Button cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        editText4=(EditText) findViewById(R.id.editText4);
        editText5=(EditText) findViewById(R.id.editText5);
        cal=(Button) findViewById(R.id.button8);
        res=(TextView) findViewById(R.id.textView5);
        etat=(TextView) findViewById(R.id.textView4);

        editText4.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b) {
                if(TextUtils.isEmpty(editText4.getText().toString())){editText4.setError("Champs Poid est Vide,Entrer Votre Poid");}

            }
        });

        editText5.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean b) {
                if(TextUtils.isEmpty(editText5.getText().toString())){editText5.setError("Champs Taille est Vide,Entrer Votre Taille");}

            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String v1=editText4.getText().toString();
                String v2=editText5.getText().toString();
                float poid=Float.parseFloat(v1);
                float taille=Float.parseFloat(v2);

                if (poid>0&&taille>0) {
                    java.text.DecimalFormat df = new java.text.DecimalFormat("0.#");
                    float s = poid / (taille * taille);
                    res.setText("Votre IMC est : " + df.format(s));
                    if (s <= 16.5f)
                        etat.setText("Interprétation de l’IMC: Dénutrition");
                    if (s > 16.5f && s <= 18.5f)
                        etat.setText("Interprétation de l’IMC: État de maigreur");
                    if (s > 18.5f && s <= 25f)
                        etat.setText("Interprétation de l’IMC: Corpulence normale");
                    if (s > 25f && s <= 30f)
                        etat.setText("Interprétation de l’IMC: Surpoids");
                    if (s > 30f && s <= 35f)
                        etat.setText("Interprétation de l’IMC: Obèsité modérée");
                    if (s > 35f && s <= 40f)
                        etat.setText("Interprétation de l’IMC: Obèsité sévère");
                    if (s > 40f)
                        etat.setText("Interprétation de l’IMC: Obèsité morbide");
                }
                else
                {Context context = getApplicationContext();
                    CharSequence text = "Les Champs doivent étre Positive";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();}
            }
        });
    }
}
