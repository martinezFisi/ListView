package com.martinez.pruebalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PrincipalActivity extends AppCompatActivity
{
    //Lista de personas
    private ListView personasListView;
    //Personas
    private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    //Adaptador
    private PersonasAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_layout);

        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_1 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_2 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_3 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_4 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_5 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_6 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_7 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_8 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_9 ) );
        listaPersonas.add( new Persona( "Miguel Antony Martinez Mora", "PUCP", "Ingeniería de Sistemas", R.drawable.lead_photo_10 ) );


        personasListView = (ListView)findViewById(R.id.personasListView);
        adaptador = new PersonasAdaptador(this, listaPersonas);
        personasListView.setAdapter(adaptador);

    }
}
