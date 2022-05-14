package com.example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class ejemploRequiredArgsConstructorLombok {
    @NonNull
    private String nombre;
    private final String name;
    private double score;
    private String[] tags;
}
