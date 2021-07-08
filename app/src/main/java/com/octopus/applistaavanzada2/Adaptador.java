package com.octopus.applistaavanzada2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ListaConsolas listaConsolas;
    private static String TAG = Adaptador.class.getSimpleName();

    public Adaptador(ListaConsolas lista){
        this.listaConsolas = lista;
        Log.d(TAG, "elementos en contructor de adaptador: " + listaConsolas.getSize());
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = new AdvancedViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.advanced_item_layout, parent, false),
                listaConsolas
        );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        Consola consola = listaConsolas.getConsola(position);
        Log.d(TAG, "Consola en onBindViewHolder: " + consola.getNombreConsola());
        AdvancedViewHolder consolaViewHolder = (AdvancedViewHolder) viewHolder;
        ((AdvancedViewHolder) viewHolder).setDatos(consola);
    }

    @Override
    public int getItemCount() {
        return listaConsolas.getSize();
    }

}
