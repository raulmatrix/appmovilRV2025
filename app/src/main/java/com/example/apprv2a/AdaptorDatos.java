package com.example.apprv2a;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptorDatos extends RecyclerView.Adapter<AdaptorDatos.VH> {

    ArrayList<String> itemsNombres; //lista
    //constructor
    public AdaptorDatos(ArrayList<String> itemsNombres){
        this.itemsNombres = itemsNombres;
    }
    @NonNull
    @Override
    public AdaptorDatos.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_datos, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorDatos.VH holder, int position) {
        String texto = itemsNombres.get(position);
        holder.tvTextoNombres.setText(texto);

        // Click en cada item
        holder.itemView.setOnClickListener(v -> {
            android.content.Intent intent = new android.content.Intent(v.getContext(), DetallesActivity.class);
            intent.putExtra("nombre", texto); // pasa el nombre al otro activity
            v.getContext().startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {

        return itemsNombres.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView tvTextoNombres;
        public VH(@NonNull View itemView) {
            super(itemView);
            tvTextoNombres = itemView.findViewById(R.id.datosItem);
        }
    }
}
