package com.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class ejemploAllArgsConstructorLombok {
    private String nombre;
    private final String name;
    private double score;
    private String[] tags;
}
