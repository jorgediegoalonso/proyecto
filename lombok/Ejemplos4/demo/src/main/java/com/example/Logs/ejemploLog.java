package com.example.Logs;

import lombok.extern.java.Log;

@Log
public class ejemploLog {
    public static void main(String[] args) {
        log.info("Funciona");
        log.warning("Aviso");
        log.severe("Error");
    }
}
