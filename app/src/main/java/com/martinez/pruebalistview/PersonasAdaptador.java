package com.martinez.pruebalistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by HP on 8/16/2016.
 */
public class PersonasAdaptador extends ArrayAdapter<Persona>
{
    //Constructor
    public PersonasAdaptador(Context context, ArrayList<Persona> listaPersonas )
    {
        super( context, R.layout.persona_list_item, listaPersonas );
    }

    //Metodo getView()
    public View getView(int position, View convertView, ViewGroup parent )
    {
        LayoutInflater inflater = LayoutInflater.from( getContext() );
        View item = inflater.inflate( R.layout.persona_list_item, null );

        ImageView fotoImageView = (ImageView)item.findViewById(R.id.fotoImageView);
        TextView nombreTextView = (TextView)item.findViewById(R.id.nombreTextView);
        TextView universidadTextView = (TextView)item.findViewById(R.id.universidadTextView);
        TextView profesionTextView = (TextView)item.findViewById(R.id.profesionTextView);

        //Item actual
        Persona persona = getItem( position );

        //Mostramos los datos
        Glide.with( getContext() ).load( persona.getFoto() ).into( fotoImageView );
        nombreTextView.setText( persona.getFullName() );
        universidadTextView.setText( persona.getUniversidad() );
        profesionTextView.setText( persona.getProfesion() );

        return item;

    }

}
