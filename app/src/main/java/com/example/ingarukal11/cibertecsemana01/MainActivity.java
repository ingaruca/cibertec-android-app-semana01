package com.example.ingarukal11.cibertecsemana01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtEdad, txtTelefono;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtEdad = (EditText)findViewById(R.id.txtEdad);
        txtTelefono = (EditText)findViewById(R.id.txtTelefono);

        btnGuardar = (Button)findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),
                        "Nombre: " + txtNombre.getText().toString() +
                        "\n Edad: " + txtEdad.getText().toString() +
                        "\n Teléfono: " + txtTelefono.getText().toString(),
                        Toast.LENGTH_LONG).show();

                txtNombre.setText(null);
                txtNombre.requestFocus();
                txtEdad.setText(null);
                txtTelefono.setText(null);

            }
        });

    }
}
