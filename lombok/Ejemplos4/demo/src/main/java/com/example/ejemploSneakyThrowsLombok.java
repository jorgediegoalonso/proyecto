package com.example;

import java.io.UnsupportedEncodingException;

import lombok.SneakyThrows;
import lombok.val;

public class ejemploSneakyThrowsLombok implements Runnable {
    public static void main(String[] args) {
        System.out.println("Lombok");
        val ejemplo = new ejemploSneakyThrowsJava();
        ejemplo.run();
        byte[] bytes = "sdfsf".getBytes();
        ejemplo.prueba(bytes);

    }

    @SneakyThrows(UnsupportedEncodingException.class)
    public void prueba(byte[] bytes) {
        String st = new String(bytes, "ufufdf");
    }

    @Override
    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
