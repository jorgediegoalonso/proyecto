package com.example;

import lombok.*;

@Value
public class ejemploValueLombok {
    private final String nombre;
    
    private int edad;
    private double ki;
    private String[] transformaciones;
    private ExitPlanet planeta;

    @Value(staticConstructor = "of")
    public static class ExitPlanet<T> {
        private final String nombre;
        private final T value;
    }
}
