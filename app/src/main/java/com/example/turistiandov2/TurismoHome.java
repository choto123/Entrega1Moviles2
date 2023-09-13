package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurismoHome extends AppCompatActivity {
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo_home);

        boton=findViewById(R.id.botonvermassitios);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsitios = new Intent(TurismoHome.this,ListaSitiosTuristicos.class);
                startActivity(intentsitios);
            }
        });
    }
}