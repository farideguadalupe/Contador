package com.faridecima.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button mBotoncontar;
    Button mBotonreiniciar;
    EditText mcampoConteo;
    int CONTADOR = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CONTADOR ++;
        mcampoConteo = (EditText) findViewById(R.id.etuqite_conteo);

        mBotoncontar = (Button) findViewById(R.id.boton_contar);
        mBotoncontar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CONTADOR++;
                mcampoConteo.setText(+CONTADOR);
            }
        });


            }
}
