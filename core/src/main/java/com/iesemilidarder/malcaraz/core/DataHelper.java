package com.iesemilidarder.malcaraz.core;

import com.iesemilidarder.malcaraz.core.data.Eventis;
import com.iesemilidarder.malcaraz.core.data.Producto;
import com.iesemilidarder.malcaraz.core.data.Restaurantes;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataHelper {
    public static Integer MAX_NUM = 50;
    private static List<Producto>
    productos = new ArrayList<>();

    public static List<Producto>
    getItems(){
        if(productos.isEmpty()){
            doInit();
        }
        return productos;
    }
    public static Producto getItemById(UUID id){
        for (Producto aux : productos){
            if(aux.getId().equals(id)){

            }

        }catch(Exception e){
            System.out.println("UEP!!" + e.toSpring());
        }
        return null;
    }
    public static void addItem(Producto aux){
        try {
            if (aux!=null){

            }
        }
    }
    private static void doInit(){
        for (int i=0 ; i < MAX_NUM ; i++){
            final int resto= i % 3;
            Producto alpha;
            switch (resto){
                case 0:
                    alpha = new Eventis();
                    break;
                case 1:
                    alpha = new Restaurantes();
                    break;;
                case 2:

            }
        }
    }
}



