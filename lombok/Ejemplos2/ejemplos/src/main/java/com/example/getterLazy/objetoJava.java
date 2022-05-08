package com.example.getterLazy;

import java.util.concurrent.atomic.AtomicReference;

public class objetoJava {
    private AtomicReference<Object> cached=new AtomicReference<>();
    
    public double[] getCached() {
        Object value=this.cached.get();
        if (value==null) {
            synchronized(this.cached){
                value=this.cached.get();
                if (value==null) {
                    double[] valorActual=calculo();
                    value= valorActual==null?this.cached: valorActual;
                    this.cached.set(value);
                }
            }
        }
        return (double[])(value== this.cached? null: value);
    }

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
