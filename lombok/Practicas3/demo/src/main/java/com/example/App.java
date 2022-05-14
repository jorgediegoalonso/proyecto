package com.example;

import lombok.val;

public class App {
    public static void main(String[] args) {
        final int[] intarray1={12,4525,234,123,653,34224,234,23413,45,1};
        final int[] intarray2={234,46,145,16587,6,345,24,45,3};
        final char[] chararray1={'f','s','d','c','a'};
        final char[] chararray2={'a','f','y','s'};

        val test1Req= new QuickSort(intarray1);
        val test2All= new QuickSort(intarray2,0,intarray2.length-1,chararray1,0,chararray1.length-1);
        val test3NoArg= new QuickSort();
        val test4Builder= QuickSort
        .builder()
        .listaInt(intarray1)
        .comienzoInt(0)
        .finalInt(intarray1.length-1)
        .listaChar(chararray2)
        .comienzoChar(0)
        .finalChar(chararray2.length-1)
        .build();

        System.out.println("No Ordenado");
        System.out.println("Objeto 1.A: "+test1Req);
        System.out.println("Objeto 1.B: "+test2All);
        System.out.println("Objeto 1.C: "+test3NoArg);
        System.out.println("Objeto 1.D: "+test4Builder);

        System.out.println("\nOrdenando...");
        test1Req.ordenarInt();
        test2All.ordenarChar();
        test2All.ordenarInt();
        test3NoArg.ordenarChar();
        test3NoArg.ordenarInt();
        test4Builder.ordenarInt();
        test4Builder.ordenarChar();

        System.out.println("\nComparar");

        System.out.println("A=A? "+test1Req.equals(test1Req));
        System.out.println("A=B? "+test1Req.equals(test2All));
        System.out.println("A=C? "+test1Req.equals(test3NoArg));
        System.out.println("A=D? "+test1Req.equals(test4Builder));


        System.out.println("\nOrdenado");
        System.out.println("Objeto 1.A: "+test1Req);
        System.out.println("Objeto 1.B: "+test2All);
        System.out.println("Objeto 1.C: "+test3NoArg);
        System.out.println("Objeto 1.D: "+test4Builder);
    }
}
