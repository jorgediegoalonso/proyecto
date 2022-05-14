package com.example;

public class ejemploRequiredArgsConstructorJava {
    private String nombre;
    private final String name;
    private double score;
    private String[] tags;

    public ejemploRequiredArgsConstructorJava(String nombre, String name){
        this.nombre=nombre;
        if (name==null) {
            new NullPointerException();
        }
        this.name=name;
    }

    @Override
    public String toString() {
        return "ejemploRequiredArgsConstructorJava(Nombre="+nombre+" ,Name="+name+" ,Score="+score+" ,tags="+tags+")";
    }
}
