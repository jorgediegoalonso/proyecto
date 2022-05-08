package com.ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import lombok.*;

public class valejemplos {
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
        val example = new ArrayList<String>();
        example.add("hello, world");
        example.add("Example");
        example.add("hola Mundo");

        val random = new Random();
        example.add("hello, world");
        val pos = random.nextInt(example.size()-1);
        val result = example.get(pos);
        return result;
    }
    
    public static void ejemplo2() {
        val map = new HashMap<>();
        map.put(0, "Zero");
        map.put(5, "five");

        for (val entry : map.entrySet()) {
            System.out.printf("\t%d:  %s\n",entry.getKey(),entry.getValue());
        }
    }


    public static String javaejemplo1() {
        final ArrayList<String> example = new ArrayList<String>();
        example.add("hello, world");
        example.add("Example");
        example.add("hola Mundo");

        final Random random = new Random();
        example.add("hello, world");
        final int pos = random.nextInt(example.size()-1);
        final String result = example.get(pos);
        return result;
    }
    
    public static void javaejemplo2() {
        final HashMap<Integer,String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(5, "five");

        for (final Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.printf("\t%d:  %s\n",entry.getKey(),entry.getValue());
        }
    }
}
