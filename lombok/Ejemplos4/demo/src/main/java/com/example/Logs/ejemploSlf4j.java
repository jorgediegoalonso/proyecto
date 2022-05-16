package com.example.Logs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ejemploSlf4j {
    public static void main(String[] args) {
        log.info("Funciona");
        log.warn("Aviso");
        log.error("Error");
    }
}
