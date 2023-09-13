package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;
    TextView nombreAmpliandoRestaurante;
    ImageView fotoAmpliandoRestaurante;
    TextView descripcionRestaurante;
    ImageView valoracionRestaurante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        nombreAmpliandoRestaurante=findViewById(R.id.nombreampliadorrestaurante);
        fotoAmpliandoRestaurante=findViewById(R.id.iconoampliadorestaurante);
        valoracionRestaurante=findViewById(R.id.valoracionRestaurante);
        descripcionRestaurante=findViewById(R.id.loremampliadorrestaurante);

        moldeRestaurante=(MoldeRestaurante)getIntent().getSerializableExtra("datosrestaurante");
        fotoAmpliandoRestaurante.setImageResource(moldeRestaurante.getFoto());
        nombreAmpliandoRestaurante.setText(moldeRestaurante.getNombre());
        valoracionRestaurante.setImageResource(moldeRestaurante.getValoracionRestaurante());
        descripcionRestaurante.setText(moldeRestaurante.getValoracionRestaurante());
    }
}