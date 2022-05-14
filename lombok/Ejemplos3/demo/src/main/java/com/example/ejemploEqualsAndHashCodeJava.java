package com.example;

import java.util.Arrays;
import java.util.Objects;

public class ejemploEqualsAndHashCodeJava {
    private String nombre;
    private double score;
    private String[] tags;
    private int id;


    public ejemploEqualsAndHashCodeJava(String nombre,double score,String[] tags,int id){
        this.id=id;
        this.nombre=nombre;
        this.score=score;
        this.tags=tags;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || getClass() !=obj.getClass()) {
            return false;
        }

        ejemploEqualsAndHashCodeJava ejemplo= (ejemploEqualsAndHashCodeJava)obj;
        return Double.compare(ejemplo.score, this.score)==0 && ejemplo.id==this.id && Objects.equals(ejemplo.nombre,this.nombre) && Arrays.equals(ejemplo.tags, this.tags);
    }

    @Override
    public int hashCode() {
        int resultado= Objects.hash(this.nombre,this.score,this.id);
        resultado= 31* resultado+ Arrays.hashCode(tags);
        return resultado;
    }
}
