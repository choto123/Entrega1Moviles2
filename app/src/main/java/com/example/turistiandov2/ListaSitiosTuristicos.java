package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.turistiandov2.adaptadores.AdaptadorHotel;
import com.example.turistiandov2.adaptadores.AdaptadorTurismo;
import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeTurismo;

import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaTurismo=new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView = findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorTurismo adaptadorTurismo=new AdaptadorTurismo(listaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);

    }

    public void llenarListaConDatos(){
        listaTurismo.add(new MoldeTurismo("morro tuzo","120000","3225962365",R.drawable.sitio,"bonitas vistas",R.drawable.feli));
        listaTurismo.add(new MoldeTurismo("termales","80000","3225962365",R.drawable.sitiouno,"Mucha naturaleza y acompañamiento",R.drawable.feli));
        listaTurismo.add(new MoldeTurismo("piedra indu","130000","3225962365",R.drawable.sitiodos,"Muy lejos",R.drawable.normii));
        listaTurismo.add(new MoldeTurismo("cascada la virgen","65000","3225962365",R.drawable.sitiotres,"Muchos mosquitos",R.drawable.troste));

    }
}