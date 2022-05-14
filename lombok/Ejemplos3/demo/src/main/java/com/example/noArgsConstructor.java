package com.example;

public class noArgsConstructor {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println("******************************");

        ejemploNoArgsConstructorJava ejemplo= new ejemploNoArgsConstructorJava();
        System.out.println(ejemplo);
        ejemplo.setA(14);
        ejemplo.setC("Hola Mundo");
        System.out.println(ejemplo+"\n");

        System.out.println("Lombok");
        System.out.println("******************************");

        ejemploNoArgsConstructorLombok ejemplo2= new ejemploNoArgsConstructorLombok();
        System.out.println(ejemplo2);
        ejemplo2.setA(14);
        ejemplo2.setC("Hola Mundo");
        System.out.println(ejemplo2);
    }
}
