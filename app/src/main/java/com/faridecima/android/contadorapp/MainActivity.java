package com.faridecima.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mBotoncontar;
    private Button mBotonreiniciar;
    private EditText mcampoConteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcampoConteo = (EditText) findViewById(R.id.etiqueta_conteo);
        mBotonreiniciar = (Button) findViewById(R.id.boton_reiniciar);
        mBotoncontar = (Button) findViewById(R.id.boton_contar);

        mBotoncontar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String a = mcampoConteo.getText().toString();
                int b = Integer.parseInt(a);
                int c= b+1;
                a=String.valueOf(c);
                mcampoConteo.setText(a);

            }
        });

        mBotonreiniciar.setOnClickListener(new View.OnClickListener (){
                      @Override
                                               public void onClick(View v) {
            mcampoConteo.setText("0");
        }
            }
        );
    }

    }
