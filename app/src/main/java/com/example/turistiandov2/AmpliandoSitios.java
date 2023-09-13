package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeTurismo;

public class AmpliandoSitios extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    ImageView fotoListaSitio;
    TextView nombreListaSitio;
    TextView descripcionSitio;
    ImageView valoracionSitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);
        fotoListaSitio=findViewById(R.id.fotoAmpliadorSitio);
        nombreListaSitio =findViewById(R.id.nombreampliadorsitios);
        descripcionSitio =findViewById(R.id.loremampliadorsitios);
        valoracionSitio =findViewById(R.id.valoracionSitio);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datossitio");

        fotoListaSitio.setImageResource(moldeTurismo.getFoto());
        nombreListaSitio.setText(moldeTurismo.getNombre());
        descripcionSitio.setText(moldeTurismo.getDescripcion());
        valoracionSitio.setImageResource(moldeTurismo.getValoracion());
    }
}