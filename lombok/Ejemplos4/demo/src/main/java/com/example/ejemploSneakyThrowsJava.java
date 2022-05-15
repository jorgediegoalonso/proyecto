package com.example;

import java.io.UnsupportedEncodingException;

import lombok.Lombok;
import lombok.val;

public class ejemploSneakyThrowsJava implements Runnable {
    public static void main(String[] args) {
        System.out.println("Java");
        val ejemplo= new ejemploSneakyThrowsJava();
        ejemplo.run();
        byte[] bytes= "sdfsf".getBytes();
        ejemplo.prueba(bytes);
    }


    public void prueba(byte[] bytes) {
        try {
            String st = new String(bytes,"ufufdf");
        } catch (UnsupportedEncodingException e) {
           throw Lombok.sneakyThrow(e);
        }
    }

    @Override
    public void run() {
        try {
            throw new Throwable();
        } catch (Throwable e) {
            throw Lombok.sneakyThrow(e);
        }
    }
}
