package com.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class ejemploEqualsAndHashCodeLombok {
    @Getter
    private String nombre;
    private double score;
    private String[] tags;
    @EqualsAndHashCode.Include
    private int id;

    public ejemploEqualsAndHashCodeLombok(String nombre,double score,String[] tags,int id){
        this.id=id;
        this.nombre=nombre;
        this.score=score;
        this.tags=tags;
    }
}
