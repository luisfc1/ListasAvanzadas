package com.octopus.applistaavanzada2;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdvancedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private String nombreString;
    private String empresaString;
    private TextView nombreConsola;
    private TextView nombreEmpresa;
    private ListaConsolas listaConsolas;
    private ImageView fotografia;

    private static final String TAG = AdvancedViewHolder.class.getSimpleName();

    public AdvancedViewHolder(@NonNull View view, ListaConsolas lista) {
        super(view);
        nombreConsola = (TextView) view.findViewById(R.id.nombreConsola);
        nombreEmpresa = (TextView) view.findViewById(R.id.nombreEmpresa);
        fotografia = (ImageView) view.findViewById(R.id.fotografia);

        listaConsolas = lista;
        Log.d(TAG, "En el constructor de AdvancedViewHolder, equipos: " + listaConsolas.getSize());
        view.setOnClickListener(this);
    }

    public void setDatos(Consola c){
        nombreConsola.setText(c.getNombreConsola());
        nombreEmpresa.setText(c.getNombreEmpresa());
        fotografia.setImageResource(c.getFotoResourse());
    }

    @Override
    public void onClick(View view) {
        int posicion = getAbsoluteAdapterPosition();
        Consola c = listaConsolas.getConsola(posicion);
        nombreString = c.getNombreConsola();
        empresaString = c.getNombreEmpresa();
        Log.d(TAG, "onClick: elemento seleccionado: " + nombreString);
    }
}
