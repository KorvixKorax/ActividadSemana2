package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker picker;
    TextView tvFecha;
    Button btDefinir;
    Button btSiguiente;

    EditText nombre, numero, correo, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvFecha  = (TextView) findViewById(R.id.edFecha);
        picker = (DatePicker) findViewById(R.id.calCalendario);
        btDefinir = (Button) findViewById(R.id.btDefinir);
        btDefinir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvFecha.setText("Fecha de nacimiento: " + picker.getDayOfMonth() + "/" + (picker.getMonth()+1) + "/" + picker.getYear());
            }
        });


        nombre = (EditText)findViewById(R.id.edNombre);
        numero = (EditText)findViewById(R.id.edNumero);
        correo = (EditText)findViewById(R.id.edCorreo);
        descripcion = (EditText)findViewById(R.id.edDescripcion);
        btSiguiente = (Button)findViewById(R.id.btSiguiente);

        btSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nombre.getText().toString();
                String fec = tvFecha.getText().toString();
                String num = numero.getText().toString();
                String email = correo.getText().toString();
                String desc = descripcion.getText().toString();

                Intent i = new Intent(MainActivity.this, ConfirmarDatos.class);

                i.putExtra("Nombre", name);
                i.putExtra("Fecha de nacimiento", fec);
                i.putExtra("Numero", num);
                i.putExtra("Correo", email);
                i.putExtra("Descripcion", desc);

                startActivity(i);

            }
        });


    }




}