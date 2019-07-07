package com.example.proyectocolecciones;

import java.io.Serializable;
import java.util.ArrayList;

public class ListadoPersonas implements Serializable {

    private ArrayList<Persona> listado;

    public ListadoPersonas() {
        listado = new ArrayList();
    }

    public ArrayList<Persona> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Persona> listado) {
        this.listado = listado;
    }

    public boolean addPersona(Persona p){
        for (Persona po: listado)
        {
            if(po.getRut().equals(p.getRut()))
            {
                 return false;
            }
        }
        listado.add(p);
        return true;
    }
}
