package com.example;

import lombok.Getter;
import lombok.With;

public class cocinero {
    @Getter @With
    private final String titulo;
    @Getter @With
    private final boolean posible;

    public cocinero(String titulo,boolean posible){
        this.posible=posible;
        this.titulo=titulo;
    }
}
