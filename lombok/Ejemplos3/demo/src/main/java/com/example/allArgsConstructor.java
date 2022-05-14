package com.example;

public class allArgsConstructor {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println("***********************************");

        String[] list={"asd","Hola Mundo"};
        ejemploAllArgsConstructorJava ejemplo1= new ejemploAllArgsConstructorJava("jda", "Fino Señores",34.33,list);
        System.out.println(ejemplo1+"\n");
    
        System.out.println("Lombok");
        System.out.println("***********************************");

        ejemploAllArgsConstructorLombok ejemplo2= new ejemploAllArgsConstructorLombok("jda", "Fino xd",32.23,list);
        System.out.println(ejemplo2);
    }
}
