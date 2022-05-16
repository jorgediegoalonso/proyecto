package com.example;

import lombok.Data;
import lombok.Synchronized;

@Data
public class ejemploSynchronizedLombok {

    private int sum = 0;
    private int count = 0;
    public static int staticSum = 0;
    public static int staticCount = 0;

    private static Object readLock = new Object();

    public void calcular() {
        setSum(getSum() + 1);
    }

    @Synchronized
    public synchronized void synchroCalcular() {
        setSum(getSum() + 1);
    }

    @Synchronized
    public static synchronized void staticSynchroCalcular() {
        staticSum = staticSum + 1;
    }

    @Synchronized
    public void sincronizar() {
        setCount(getCount() + 1);
    }

    @Synchronized("readLock")
    public static void sincronizarEstatico() {
        staticCount= staticCount+1;
    }
}