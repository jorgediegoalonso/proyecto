package com.example;

import java.util.Arrays;
import java.util.Collection;

public class ejemploBuilder {
    public static void main(String[] args) {
        

        System.out.println("Java");
        System.out.println("******************************");

        Collection<String> elementos=Arrays.asList("1","2");
        ejemploBuilderJava ejemploJava= ejemploBuilderJava
        .builder()
        .nombre("Juan")
        .edad(12)
        .ocupaciones("prom")
        .ocupaciones("Master")
        .ocupaciones(elementos)
         .build();

         System.out.println(ejemploJava+"\n");

        System.out.println("Lombok");
        System.out.println("******************************");

        ejemploBuilderLombok ejemploLombok= ejemploBuilderLombok
        .builder()
        .nombre("Jorge")
        .edad(19)
        .ocupacion("prom")
        .ocupacion("Becario")
        .ocupacions(elementos)
        .execute();
        System.out.println(ejemploLombok);
    }
}
