package com.example.Logs;

import lombok.extern.slf4j.XSlf4j;

@XSlf4j
public class ejemploXslf4j {
    public static void main(String[] args) {
        log.info("Funciona");
        log.warn("Aviso");
        log.error("Error");
    }

}
