package com.example.getterLazy;

public class getterLazy {
    public static void main(String[] args) {
        objetoJava obj= new objetoJava();
        double[] cached= obj.getCached();

        System.out.println("Java\n");
        System.out.println("1.Size: "+cached.length);
        double[] cached2= obj.getCached();
        System.out.println("2.Size: "+cached2.length);
        System.out.println("--------------------------------------------------------------------\n");

        objetoLombok obj2= new objetoLombok();
        double[] cached3= obj2.getCached();

        System.out.println("Lombok\n");
        System.out.println("1.Size: "+cached3.length);
        double[] cached4= obj2.getCached();
        System.out.println("2.Size: "+cached4.length);
    }
}
