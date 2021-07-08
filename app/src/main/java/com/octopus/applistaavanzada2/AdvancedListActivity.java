package com.octopus.applistaavanzada2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;

public class AdvancedListActivity extends Activity {

    WearableRecyclerView lista_avanzada;
    ListaConsolas listaConsolas;
    Adaptador adaptador;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_list);

        listaConsolas = new ListaConsolas();
        adaptador = new Adaptador(listaConsolas);

        lista_avanzada = (WearableRecyclerView) findViewById(R.id.advanced_recyclerview);
        lista_avanzada.setEdgeItemsCenteringEnabled(true);
        lista_avanzada.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        lista_avanzada.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(lista_avanzada.getContext(),
                layoutManager.getOrientation());

        lista_avanzada.addItemDecoration(dividerItemDecoration);

        lista_avanzada.setAdapter(adaptador);
    }
}