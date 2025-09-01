package com.example.apprv2a;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetallesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        TextView tvDetalle = findViewById(R.id.tvDetalle);

        // Recibe el dato enviado
        String nombre = getIntent().getStringExtra("nombre");
        tvDetalle.setText("Detalles de: " + nombre);
    }
}
