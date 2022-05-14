package com.example;

public class ejemploAllArgsConstructorJava {
    private String nombre;
    private final String name;
    private double score;
    private String[] tags;

    public ejemploAllArgsConstructorJava(String nombre, String name, double score, String[] tags){
        this.nombre=nombre;
        this.name=name;
        this.score=score;
        this.tags=tags;
    }

    @Override
    public String toString() {
        return "ejemploRequiredArgsConstructorJava(Nombre="+nombre+" ,Name="+name+" ,Score="+score+" ,tags="+tags+")";
    }
}
