package com.example;

import lombok.Data;
import lombok.Synchronized;
import lombok.extern.jbosslog.JBossLog;

@JBossLog
@Data
public class varValues {
    private long longValue;
    private double doubleValue;

    @Synchronized
    public synchronized void calcularLong() {
        setLongValue(getLongValue()+1);
        logger.info("Long: "+longValue);

    }

    @Synchronized
    public synchronized void calcularDouble() {
        setDoubleValue(getDoubleValue()+0.1);
        logger.info("Double: "+doubleValue);
    }
}
