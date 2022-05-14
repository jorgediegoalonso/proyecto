package com.example;

import lombok.val;

public class equalsAndHashCode {
    public static void main(String[] args) {
         System.out.println("Java");
    System.out.println("******************************");
    
    String[] array1={"Hola","Mundo","Java"};
    String[] array2={"gg","ez","zz"};
    val ejemplo1= new ejemploEqualsAndHashCodeJava("Primero", 23.23, array1, 1);
    val ejemplo2= new ejemploEqualsAndHashCodeJava("Segundo", 4.44, array2, 2);
    val ejemplo3= new ejemploEqualsAndHashCodeJava("Segundo", 4.44, array2, 2);


    System.out.println("Comparar: "+ejemplo1.equals(ejemplo2));
    System.out.println("Comparar: "+ejemplo3.equals(ejemplo2));
    System.out.println("Comparar: "+ejemplo3.equals(ejemplo1));

    System.out.println("HashCode: "+ejemplo1.hashCode()+"\n");

    System.out.println("Lombok");
    System.out.println("******************************");

    val ejemplo4= new ejemploEqualsAndHashCodeJava("Primero", 23.23, array1, 1);
    val ejemplo5= new ejemploEqualsAndHashCodeJava("Segundo", 4.44, array2, 2);
    val ejemplo6= new ejemploEqualsAndHashCodeJava("Segundo", 4.44, array2, 2);


    System.out.println("Comparar: "+ejemplo4.equals(ejemplo5));
    System.out.println("Comparar: "+ejemplo6.equals(ejemplo5));
    System.out.println("Comparar: "+ejemplo6.equals(ejemplo4));

    System.out.println("HashCode: "+ejemplo5.hashCode()+"\n");
    }
   

}
