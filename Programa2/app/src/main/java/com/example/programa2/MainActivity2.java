package com.example.programa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText resul = (EditText) findViewById(R.id.txtResultado);
        Button btnVolver = (Button) findViewById(R.id.btnVolver);
        resul.setKeyListener(null);

        Intent intent = getIntent();
        String resultado = intent.getStringExtra("resultado");
        resul.setText("" + resultado);


        btnVolver.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantalla);
            }
        });



    }
}
