package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Almacen {

    @ToString.Exclude
    private String ingrediente;
    private int cantidad;
    private String caducidad;

    public Almacen(){

    }
}
