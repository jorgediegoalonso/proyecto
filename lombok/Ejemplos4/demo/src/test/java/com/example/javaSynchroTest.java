package com.example;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.Test;

public class javaSynchroTest {

    @Test
    //fallara normalmente porque no se usa multihilo
    public void multiHilo_NoSincronizado() throws InterruptedException{
        ExecutorService servicio= Executors.newFixedThreadPool(3);
        ejemploSynchronizedJava ejemplo = new ejemploSynchronizedJava();
        IntStream.range(0,1000)
        .forEach(count -> servicio.submit(ejemplo::calcular));
        servicio.awaitTermination(100,TimeUnit.MILLISECONDS);
        assertEquals(1000, ejemplo.getSum());
    }

    @Test
    //Este Funcionra ya que usa multihilo
    public void multiHilo_Sincronizado() throws InterruptedException{
        ExecutorService servicio= Executors.newFixedThreadPool(3);
        ejemploSynchronizedJava ejemplo = new ejemploSynchronizedJava();
        IntStream.range(0,1000)
        .forEach(count -> servicio.submit(ejemplo::synchroCalcular));
        servicio.awaitTermination(100,TimeUnit.MILLISECONDS);
        assertEquals(1000, ejemplo.getSum());
    }

    @Test
    //Este Funcionra ya que usa multihilo
    public void multiHilo_BloqueadoSincronizado() throws InterruptedException{
        ExecutorService servicio= Executors.newFixedThreadPool(3);
        ejemploSynchronizedJava ejemplo = new ejemploSynchronizedJava();
        IntStream.range(0,1000)
        .forEach(count -> servicio.submit(ejemplo::sincronizar));
        servicio.awaitTermination(100,TimeUnit.MILLISECONDS);
        assertEquals(1000, ejemplo.getCount());
    }

    @Test
     //Este Funcionra ya que usa multihilo
    public void multiHilo_StaticSincronizado() throws InterruptedException{
        ExecutorService servicio= Executors.newCachedThreadPool();
        IntStream.range(0,1000)
        .forEach(count -> servicio.submit(ejemploSynchronizedJava::staticSynchroCalcular));
        servicio.awaitTermination(100,TimeUnit.MILLISECONDS);
        assertEquals(1000, ejemploSynchronizedJava.staticSum);
    }

    @Test
     //Este Funcionra ya que usa multihilo
    public void multiHilo_StaticBloqueadoSincronizado() throws InterruptedException{
        ExecutorService servicio= Executors.newCachedThreadPool();
        IntStream.range(0,1000)
        .forEach(count -> servicio.submit(ejemploSynchronizedJava::sincronizarEstatico));
        servicio.awaitTermination(100,TimeUnit.MILLISECONDS);
        assertEquals(1000, ejemploSynchronizedJava.getStaticCount());
    }
} 
