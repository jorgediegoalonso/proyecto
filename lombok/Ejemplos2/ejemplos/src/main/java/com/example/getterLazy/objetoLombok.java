package com.example.getterLazy;

import lombok.Getter;

public class objetoLombok {
    @Getter(lazy=true)
    private final double[] cached= calculo();
    
    private double[] calculo() {
        long inicio=System.currentTimeMillis();
        double[] result= new double[100000000];

        for (int i = 0; i < result.length; i++) {
            result[i]=Math.asin(i);
        }

        long fin=System.currentTimeMillis();
        System.out.println("Tiempo de calculo: "+(fin-inicio));
        return result;
    }
}