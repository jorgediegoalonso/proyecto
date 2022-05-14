package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import lombok.Cleanup;
import lombok.val;
import lombok.var;

public class App {
    private Map<String,Almacen> mapa= new HashMap<>();
    public static void main(String[] args) {
        val app= new App();
        val receta= new Receta();
        var cocinerp= new cocinero(null, false);

        app.leerAlmacen();
        cocinerp= cocinerp.withTitulo(receta.getTitulo());
        cocinerp= cocinerp.withPosible(app.canCook(receta));

        System.out.println("Se puede cocinar: "+cocinerp.isPosible()+" la receta: "+cocinerp.getTitulo());
    }

    public void leerAlmacen() {
        val almacen= new File("almacen.txt");
        try {
            @Cleanup
            val filereader= new FileReader(almacen);
            @Cleanup
            val buffered= new BufferedReader(filereader);

            var newRow="";
            var nuevaComida=new String[]{""};
            while ((newRow=buffered.readLine())!= null) {
                nuevaComida=newRow.split(";");
                if (nuevaComida.length==3) {
                      val elemento= iniciarElemento(nuevaComida[0],Integer.parseInt(nuevaComida[1]),nuevaComida[2]);
                mapa.put(elemento.getIngrediente(), elemento);    
                } else {
                    System.out.println("Producto invalido");
                } 
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Almacen iniciarElemento(String ingrediente,int cantidad,String caducidad){
        val elemento= new Almacen();
        elemento.setIngrediente(ingrediente);
        elemento.setCaducidad(caducidad);
        elemento.setCantidad(cantidad);
        return elemento;
    }


    public boolean canCook(Receta receta){
        val returned= new AtomicBoolean(true);
        val ingredientes= receta.getIngrediente();

        ingredientes.forEach((k,v) -> returned.set(returned.get()&&mapa.containsKey(k)&&(mapa.get(k).getCantidad()>=v)));
        return returned.get();
    }
}
