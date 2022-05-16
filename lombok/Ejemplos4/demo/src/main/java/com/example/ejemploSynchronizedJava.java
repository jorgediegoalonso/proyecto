package com.example;

import lombok.Data;

@Data
public class ejemploSynchronizedJava {

    private int sum=0;
    private int count=0;
    public static int staticSum=0;
    public static int staticCount=0;

    private static Object readLock= new Object();

    public void calcular() {
        setSum(getSum()+1);
    }

    public synchronized void synchroCalcular() {
        setSum(getSum()+1);
    }

    public static synchronized void staticSynchroCalcular() {
        staticSum = staticSum+1;
    }

    public void sincronizar() {
        synchronized(this){
            setCount(getCount()+1);
        }
    }

    public static void sincronizarEstatico() {
        synchronized(readLock){
            setStaticCount(getStaticCount()+1);
        }
    }

    public static void setStaticCount(int i) {
        ejemploSynchronizedJava.staticCount=i;
    }

    public static int getStaticCount() {
        return ejemploSynchronizedJava.staticCount;
    }
}
