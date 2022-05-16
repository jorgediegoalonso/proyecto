package com.example.Logs;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class ejemploCommonsLog {
    public static void main(String[] args) {
        log.info("Funciona");
        log.warn("Aviso");
        log.error("Error");
    }
}
