package com.example.proyectocolecciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListadoPersonas personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personas = new ListadoPersonas();
    }

    public void Guardar(View view) {
        try
        {
            EditText auxRutIngresar = (EditText) findViewById(R.id.txtRutIngresar);
            EditText auxNombreIngresar = (EditText) findViewById(R.id.txtNombreIngresar);
            Persona p = new Persona();
            p.setRut(auxRutIngresar.getText().toString());
            p.setNombre(auxNombreIngresar.getText().toString());
            boolean resultado = personas.addPersona(p);
            if(resultado)
            {
                Mensaje("Persona creada correctamente!!!");
                auxRutIngresar.setText("");
                auxNombreIngresar.setText("");
                auxRutIngresar.requestFocus();
            }
            else
            {
                Mensaje("No se pudo registrar. Persona ya registrada!!!");
                auxRutIngresar.requestFocus();
                auxRutIngresar.selectAll();
            }
        }
        catch(Exception ex)
        {
            Mensaje(ex.getMessage());
        }
    }

    public void Mostrar(View view) {
        Intent auxIntentListado = new Intent(this,PantallaListado.class);
        auxIntentListado.putExtra("varListado",personas.getListado());
        startActivity(auxIntentListado);
    }

    public void Mensaje(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }
}
