package com.example;

import lombok.*;

@Data
public class ejemploDataLombok {
    private final String nombre;
    @Setter(AccessLevel.PACKAGE)
    private int edad;
    private double ki;
    private String[] transformaciones;
    @ToString.Exclude
    private ExitPlanet planeta;

    @Data(staticConstructor = "of")
    public static class ExitPlanet<T> {
        private final String nombre;
        private final T value;
    }
}
