package com.example.proyectocolecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;

public class PantallaListado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_listado);
        CargarListadoPersonas();
    }

    private void CargarListadoPersonas(){
        ListView auxList = (ListView) findViewById(R.id.lstPersonas);
        Intent auxIntent = getIntent();
        ArrayList<Persona> listado = (ArrayList<Persona>)auxIntent.getSerializableExtra
                ("varListado");
        ArrayList<String> listadoPersonas = new ArrayList();
        for (Persona p : listado)
        {
            listadoPersonas.add(p.getRut() + " | " + p.getNombre());
        }
        auxList.setAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,listadoPersonas));
    }

    public void Listar(View view) {
        CargarListadoPersonas();
    }
}
