package com.martinez.pruebalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PrincipalActivity extends AppCompatActivity
{
    //Lista de personas
    private ListView personasListView;
    //Personas
    private Persona personas[] = new Persona[]
            {
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_1 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_2 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_3 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_4 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_5 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_6 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_7 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_8 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_9 ),
                    new Persona( "Miguel Antony Martinez Mora", "UNMSM", "Ingeniería de Sistemas", R.drawable.lead_photo_10 )
            };
    //Adaptador
    private PersonasAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_layout);

        personasListView = (ListView)findViewById(R.id.personasListView);
        adaptador = new PersonasAdaptador(this, personas);
        personasListView.setAdapter(adaptador);

    }
}
