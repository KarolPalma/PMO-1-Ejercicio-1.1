package com.example.programa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = (EditText) findViewById(R.id.txtnum1);
        EditText num2 = (EditText) findViewById(R.id.txtnum2);
        Button btnSuma = (Button) findViewById(R.id.btnSuma);
        Button btnResta = (Button) findViewById(R.id.btnResta);
        Button btnDividir = (Button) findViewById(R.id.btnDividir);
        Button btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);


        btnSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                Proceso proceso = new Proceso(n1, n2);
                //Toast.makeText(getApplicationContext(), "Suma: "+ proceso.Suma(n1,n2), Toast.LENGTH_LONG).show();
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                pantalla.putExtra("resultado", " " + proceso.Suma(n1, n2));
                startActivity(pantalla);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                Proceso proceso = new Proceso(n1, n2);
                //Toast.makeText(getApplicationContext(), "Resta: "+ proceso.Resta(n1,n2), Toast.LENGTH_LONG).show();
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                pantalla.putExtra("resultado", " " + proceso.Resta(n1, n2));
                startActivity(pantalla);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                Proceso proceso = new Proceso(n1, n2);
                //Toast.makeText(getApplicationContext(), "Multiplicar: "+ proceso.Multiplicar(n1,n2), Toast.LENGTH_LONG).show();
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                pantalla.putExtra("resultado", " " + proceso.Multiplicar(n1, n2));
                startActivity(pantalla);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                Proceso proceso = new Proceso(n1, n2);
                //Toast.makeText(getApplicationContext(), "División: "+ proceso.Dividir(n1,n2), Toast.LENGTH_LONG).show();
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);
                pantalla.putExtra("resultado", " " + proceso.Dividir(n1, n2));
                startActivity(pantalla);
            }
        });


    }
}