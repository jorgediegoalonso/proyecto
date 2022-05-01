package com.ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import lombok.*;

public class varEjemplos {
    public static void main(String[] args) {
        System.out.println("Lombok:");
        System.out.println("Ejemplo1:"+ejemplo1());
        System.out.println("Ejemplo2");
        ejemplo2();

        System.out.println("\n");
        
        System.out.println("Java:");
        System.out.println("Ejemplo1:"+javaejemplo1());
        System.out.println("Ejemplo2");
        javaejemplo2();
    }

    public static String ejemplo1() {
        var example = new ArrayList<String>();
        example.add("hello, world");
        example.add("Example");

        var random = new Random();
        example.add("hello, world");
        var pos = random.nextInt(example.size()-1);
        var result = example.get(pos);

        example = new ArrayList<String>();
        example.add("hola Mundo");
        example.add("Ejemplo");
        pos= random.nextInt(example.size()-1);
        result = result + " || " + example.get(pos);
        return result;
    }
    
    public static void ejemplo2() {
        var map = new HashMap<>();
        map.put(0, "Zero");
        map.put(5, "five");

        for (var entry : map.entrySet()) {
            System.out.printf("\t%d:  %s\n",entry.getKey(),entry.getValue());
        }

        map = new HashMap<>();
        map.put(1, "One");
        map.put(6, "Six");

        for (var entry : map.entrySet()) {
            System.out.printf("\t%d:  %s\n",entry.getKey(),entry.getValue());
        }
    }


    public static String javaejemplo1() {
        ArrayList<String> example = new ArrayList<>();
        example.add("hello, world");
        example.add("Example");

        Random random = new Random();
        example.add("hello, world");
        int pos = random.nextInt(example.size()-1);
        String result = example.get(pos);

        example = new ArrayList<String>();
        example.add("hola Mundo");
        example.add("Ejemplo");
        pos= random.nextInt(example.size()-1);
        result = result + " || " + example.get(pos);
        return result;
    }
    
    public static void javaejemplo2() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(5, "five");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.printf("\t%d:  %s\n",entry.getKey(),entry.getValue());
        }

        map = new HashMap<>();
        map.put(1, "One");
        map.put(6, "Six");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.printf("\t%d:  %s\n",entry.getKey(),entry.getValue());
        }
    }
}
