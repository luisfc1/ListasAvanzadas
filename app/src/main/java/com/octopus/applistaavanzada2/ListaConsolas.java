package com.octopus.applistaavanzada2;

import java.util.ArrayList;

public class ListaConsolas {
    private ArrayList<Consola> consolas;

    public ListaConsolas(){
        consolas = new ArrayList<Consola>();
        Consola e1 = new Consola("Xbox One X", "Microsoft", R.drawable.xbox_one_x);
        consolas.add(e1);
        Consola e2 = new Consola("Xbox Series S", "Microsoft", R.drawable.xbox_series_s);
        consolas.add(e2);
        Consola e3 = new Consola("Xbox Series X", "Microsoft", R.drawable.xbox_series_x);
        consolas.add(e3);
        Consola e4 = new Consola("Play Station 4 Pro", "Sony", R.drawable.play_station_4_pro);
        consolas.add(e4);
        Consola e5 = new Consola("Play Station 5", "Sony", R.drawable.play_station_5);
        consolas.add(e5);
        Consola e6 = new Consola("Nintendo Switch", "Nintendo", R.drawable.nintendo_switch);
        consolas.add(e6);
        Consola e7 = new Consola("Nintendo Switch Lite", "Nintendo", R.drawable.nintendo_switch_lite);
        consolas.add(e7);
    }

    public int getSize(){
        return consolas.size();
    }

    public Consola getConsola(int posicion){
        return consolas.get(posicion);
    }

}
