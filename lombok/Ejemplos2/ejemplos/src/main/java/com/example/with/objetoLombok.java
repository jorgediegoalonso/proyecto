package com.example.with;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.With;

public class objetoLombok {
    @With
    @NonNull
    @Getter
    private final String nombre;
    
    @With(AccessLevel.PROTECTED)
    @Getter
    private final int edad;

    public objetoLombok(String nombre,Integer edad) {
        if (nombre==null) throw new NullPointerException();
        this.nombre=nombre;
        this.edad=edad;
    }
}