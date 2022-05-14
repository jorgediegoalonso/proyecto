package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import lombok.Cleanup;
import lombok.Getter;
import lombok.val;
import lombok.var;

@Getter
public class Receta {
    private final String titulo=recuperarTitulo();
    private final Map<String,Integer> ingrediente=recuperarIngrediente();
    private final String instrucciones=recuperarInstrucciones();

    private String recuperarTitulo(){
        var returned="";
        val title = readLineFromFile(0).split(":"); 
        if (title.length==2) {
            returned=title[1];
        }else{
            System.out.println("Titulo invalido");
        }
        return returned;
    }
    private Map<String,Integer> recuperarIngrediente(){
        val returned=new HashMap<String,Integer>();
        val ingredientes=readLineFromFile(1).split(";");
        if (ingredientes.length==2) {
           val allingr= ingredientes[1].split(";");
           if (allingr.length%2==0) {
               for (int i = 0; i < allingr.length; i=i+2) {
                   returned.put(allingr[i], Integer.valueOf(allingr[i+1]));
               }
           }else{
            System.out.println("Ingrediente invalido");
           }
        }else{
            System.out.println("Ingrediente invalido");
        }
        return returned;
        
    }
    private String recuperarInstrucciones(){ 
        var returned="";
        val inst = readLineFromFile(2).split(":"); 
        if (inst.length==2) {
            returned=inst[1];
        }else{
            System.out.println("Instruccion invalida");
        }
        return returned;
    }

    private String readLineFromFile(int linea){
        var returned="";
        val receta= new File("receta.txt");

        try {
            @Cleanup
            val fileReader= new FileReader(receta);
            @Cleanup
            var buffered= new BufferedReader(fileReader);

            Object[] ingredientes= buffered.lines().toArray();
            if (ingredientes.length>=linea) {
                returned=(String)ingredientes[linea];
            }
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        return returned;
    }
}
