package com.example.with;

public class objetoJava {
    private final String nombre;
    protected final Integer edad;

    public objetoJava(String nombre,Integer edad) {
        if (nombre==null) throw new NullPointerException();
        this.nombre=nombre;
        this.edad=edad;
    }

    public objetoJava withNombre(String nombre) {
        if (nombre==null) throw new NullPointerException();
        return this.nombre.equals(nombre)?this: new objetoJava(nombre, edad);
    }
    protected objetoJava withEdad(Integer edad) {
        return this.edad.equals(edad)?this: new objetoJava(nombre, edad);
    }

    public String getNombre() {
        return this.nombre;
    }
    public Integer getEdad() {
        return this.edad;
    }
}
