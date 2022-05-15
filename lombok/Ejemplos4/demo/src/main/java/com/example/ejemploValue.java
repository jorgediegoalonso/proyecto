package com.example;

import lombok.*;

public class ejemploValue {
    public static void main(String[] args) {
        System.out.println("Lombok");

        String[] trasformaciones={"Super","Super2","Dios","Azul"};
        val ejemplo = new ejemploValueLombok("Vegeta",48,43654363D,trasformaciones,ejemploValueLombok.ExitPlanet.of("Planeta Vegeta", 5));
        System.out.println(ejemplo);
    }
}
