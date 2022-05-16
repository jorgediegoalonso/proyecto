package com.example.Logs;

import lombok.extern.jbosslog.JBossLog;

@JBossLog
public class ejemploJbossLog {
    public static void main(String[] args) {
        log.info("Funciona");
        log.warn("Aviso");
        log.error("Error");
    }
}
