package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView descripcionHotel;
    ImageView valoracionHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.iconohoteles);
        nombreAmpliandoHotel =findViewById(R.id.nombreampliadorhotel);
        descripcionHotel =findViewById(R.id.loremampliadorhotel);
        valoracionHotel =findViewById(R.id.valoracionHotel);

        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        descripcionHotel.setText(moldeHotel.getDescripcion());
        valoracionHotel.setImageResource(moldeHotel.getValoracion());

    }
}