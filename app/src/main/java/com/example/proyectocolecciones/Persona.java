package com.example.proyectocolecciones;

import java.io.Serializable;

public class Persona implements Serializable {

    private String rut;
    private String nombre;


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
