package com.example.Logs;

import org.apache.log4j.BasicConfigurator;

import lombok.extern.log4j.Log4j;

@Log4j
public class ejemploLog4j {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.info("Funciona");
        log.warn("Aviso");
        log.error("Error");
    }
}
