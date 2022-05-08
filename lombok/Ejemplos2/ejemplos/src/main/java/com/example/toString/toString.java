package com.example.toString;

public class toString {
    public static void main(String[] args) {
        objetoJava obj= new objetoJava();
        
        System.out.println("Java\n");
        System.out.println(obj.toString());
        System.out.println("--------------------------------------------------------------------\n");

        objetoLombok obj2= new objetoLombok();      
        System.out.println("Lombok\n");
        System.out.println(obj2.toString());
    }
}
