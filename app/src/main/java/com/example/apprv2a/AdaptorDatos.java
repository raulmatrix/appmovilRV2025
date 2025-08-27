package com.example.apprv2a;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptorDatos extends RecyclerView.Adapter<AdaptorDatos.VH> {


    @NonNull
    @Override
    public AdaptorDatos.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorDatos.VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VH extends RecyclerView.ViewHolder {
        public VH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
