package com.example;

public class requiredArgsConstructor {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println("***********************************");

        ejemploRequiredArgsConstructorJava ejemplo1= new ejemploRequiredArgsConstructorJava("jda", "Fino Señores");
        System.out.println(ejemplo1+"\n");
    
        System.out.println("Lombok");
        System.out.println("***********************************");

        ejemploRequiredArgsConstructorLombok ejemplo2= new ejemploRequiredArgsConstructorLombok("jda", "Fino Señores");
        System.out.println(ejemplo2);
    }
}
