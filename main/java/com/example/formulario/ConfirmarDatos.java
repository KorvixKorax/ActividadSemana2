package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView NombreR, FechaR, NumeroR, CorreoR, DescripcionR;
    Button btEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        NombreR = (TextView)findViewById(R.id.tvNombreR);
        FechaR = (TextView)findViewById(R.id.tvFechaR);
        NumeroR = (TextView)findViewById(R.id.tvNumeroR);
        CorreoR = (TextView)findViewById(R.id.tvCorreoR);
        DescripcionR = (TextView)findViewById(R.id.tvDescripcionR);
        btEditar = (Button)findViewById(R.id.btEditar);

        btEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(ConfirmarDatos.this, MainActivity.class);
                startActivity(j);
            }
        });

        mostrarDato ();
    }

       private void mostrarDato() {
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("Nombre");
        String fecha = datos.getString("Fecha de nacimiento");
        String numero = datos.getString("Numero");
        String correo = datos.getString("Correo");
        String descripcion = datos.getString("Descripcion");

        NombreR.setText(nombre);
        FechaR.setText(fecha);
        NumeroR.setText(numero);
        CorreoR.setText(correo);
        DescripcionR.setText(descripcion);




    }
}