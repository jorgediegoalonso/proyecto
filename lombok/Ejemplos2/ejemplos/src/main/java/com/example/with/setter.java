package com.example.with;

public class setter {
    public static void main(String[] args) {
        objetoJava obj= new objetoJava("Juan",25);
        
        System.out.println("Java\n");
        System.out.println("Nombre: "+obj.getNombre()+"\nEdad: "+obj.getEdad());
        obj= obj.withNombre("Emilia");
        System.out.println("---------\n");
        System.out.println("Nombre: "+obj.getNombre()+"\nEdad: "+obj.getEdad());
        System.out.println("--------------------------------------------------------------------\n");

        objetoLombok obj2= new objetoLombok("Ravi",40);
        System.out.println("Lombok\n");
        System.out.println("Nombre: "+obj2.getNombre()+"\nEdad: "+obj2.getEdad());
        obj2= obj2.withNombre("Rem");
        System.out.println("---------\n");
        System.out.println("Nombre: "+obj2.getNombre()+"\nEdad: "+obj2.getEdad());
    }
}
