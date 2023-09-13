package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.AdaptadorHotel;
import com.example.turistiandov2.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHotel adaptadorHotel=new AdaptadorHotel(listaHoteles);
        recyclerView.setAdapter(adaptadorHotel);

    }

    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("El balcon","$150000","3225608780",R.drawable.hotelcinco,"hotel hermoso",R.drawable.feli));
        listaHoteles.add(new MoldeHotel("La campesina","$80000","3225608787",R.drawable.hoteldos,"hotel buena vista",R.drawable.troste));
        listaHoteles.add(new MoldeHotel("Mundo magico","$180000","3225608778",R.drawable.hoteltres,"no Tiene Parqueadero",R.drawable.feli));
        listaHoteles.add(new MoldeHotel("Angel","$60000","3225608741",R.drawable.hotelcuatro,"Muchos mosquitos",R.drawable.normii));
        listaHoteles.add(new MoldeHotel("Mirador","$190000","3225608720",R.drawable.hotelcinco,"Mucho Ruido",R.drawable.normii));
    }
}