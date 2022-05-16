package com.example;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.Test;

import lombok.val;

public class test {
    
    @Test
    public void calcularLong() throws InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(3);
        val fixValues= new fixValues(1000, 1.1);
        val varValues = new varValues();

        varValues.setLongValue(fixValues.getLongValue());
        IntStream.range(0,5000).forEach(count -> service.submit(varValues::calcularLong));
        service.awaitTermination(5000, TimeUnit.MILLISECONDS);
        assertEquals(6000, varValues.getLongValue());
    }

    @Test
    public void calcularDouble() throws InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(3);
        val fixValues= new fixValues(1000, 1.1);
        val varValues = new varValues();

        varValues.setDoubleValue(fixValues.getDoubleValue());
        IntStream.range(0,5000).forEach(count -> service.submit(varValues::calcularDouble));
        service.awaitTermination(5000, TimeUnit.MILLISECONDS);
        assertEquals(501.1, varValues.getDoubleValue(),0.1);
    }
}
