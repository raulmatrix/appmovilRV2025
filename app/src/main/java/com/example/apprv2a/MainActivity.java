package com.example.apprv2a;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvNombres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvNombres = findViewById(R.id.listaRV);
        ArrayList<String> datos = new ArrayList<String>();
        datos.add("Ana");datos.add("Luis");datos.add("Pedro");
        datos.add("Jose");datos.add("Carlos");datos.add("Luisa");

        //Layout Manager
        rvNombres.setLayoutManager(new LinearLayoutManager(this));

        //separador visual
        rvNombres.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        );

        //Adapter
        AdaptorDatos adaptorDatos = new AdaptorDatos(datos);
        rvNombres.setAdapter(adaptorDatos);

    }
}