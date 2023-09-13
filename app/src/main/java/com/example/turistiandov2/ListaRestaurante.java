package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class ListaRestaurante extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurante = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView = findViewById(R.id.listadinamicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        llenarListaConDatos();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(listaRestaurante);
        recyclerView.setAdapter(adaptadorRestaurante);

    }

    public void llenarListaConDatos(){
        listaRestaurante.add(new MoldeRestaurante("togo",R.drawable.restaurante,"$150000","3225608780","pescado",R.drawable.feli,"comida muy rica y muy rapido"));
        listaRestaurante.add(new MoldeRestaurante("Gato",R.drawable.restaurante1,"$180000","3225605680","pizza",R.drawable.normii,"llega la comida muy fria"));
        listaRestaurante.add(new MoldeRestaurante("Martin",R.drawable.restaurantes1,"$50000","3220808780","asados",R.drawable.troste, "muy buena atencion"));
        listaRestaurante.add(new MoldeRestaurante("el balcon",R.drawable.restaurante2,"$150000","3225608780","pastas",R.drawable.feli, "indicaciones para llegar muy complicadas"));
        listaRestaurante.add(new MoldeRestaurante("logia",R.drawable.restaurante3,"$180000","3225605680","italiana",R.drawable.normii,"pocas opciones para elegir"));
    }
}