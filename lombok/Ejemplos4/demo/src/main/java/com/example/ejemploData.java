package com.example;

import lombok.val;

public class ejemploData {
    public static void main(String[] args) {
        System.out.println("Lombok");

        String[] trasformaciones={"Super","Super2","Dios","Azul"};
        val ejemplo = new ejemploDataLombok("Vegeta");
        ejemplo.setKi(87384572D);
        ejemplo.setTransformaciones(trasformaciones);
        ejemplo.setPlaneta(ejemploDataLombok.ExitPlanet.of("Planeta Vegeta", 5));

        System.out.println("\nNombre: "+ejemplo.getNombre());
        System.out.println("ki: "+ejemplo.getKi());
        System.out.println("Edad: "+ejemplo.getEdad());
        System.out.println("Transformaciones: "+ejemplo.getTransformaciones());
    }
}
