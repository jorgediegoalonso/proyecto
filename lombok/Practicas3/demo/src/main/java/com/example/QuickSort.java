package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.val;
import lombok.var;

@Builder
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class QuickSort {
    
    @NonNull @Setter
    private int[] listaInt;
    private int comienzoInt;
    private int finalInt;

    @Setter
    private char[] listaChar;
    private int comienzoChar;
    private int finalChar;

    public void ordenarInt() {
        if (listaInt!=null && listaInt.length>0) {
            if (finalInt==0) {
                finalInt=listaInt.length-1;
            }

            sort(listaInt,comienzoInt,finalInt);
        }else{
            System.out.println("Lista no inicializada o sin valores");
        }
    }

    public void ordenarChar() {
        if (listaChar!=null && listaChar.length>0) {
            if (finalChar==0) {
                finalChar=listaChar.length-1;
            }
            val arrayCharToInt=charToInt(listaChar);
            sort(arrayCharToInt,comienzoChar,finalChar);
            listaChar= intToChar(arrayCharToInt);
        }else{
            System.out.println("Lista no inicializada o sin valores");
        }
    }

    private void sort(int[] listaAOrdenar, int inicio,int fin){
        int pivot= listaAOrdenar[inicio];
        int i= inicio;
        int j= fin;
        int tmp;

        while (i<j) {
            while (listaAOrdenar[i]<=pivot && i<j) {
                i++;
            }
            while (listaAOrdenar[j]>pivot) {
                j--;
            }
            if (i<j) {
                tmp= listaAOrdenar[i];
                listaAOrdenar[i]= listaAOrdenar[j];
                listaAOrdenar[j]=tmp;
            }
        }
        listaAOrdenar[inicio]= listaAOrdenar[j];
        listaAOrdenar[j]= pivot;

        if (inicio<j-1) {
            sort(listaAOrdenar, inicio, j-1);
        }
        if (j+1<fin) {
            sort(listaAOrdenar, j+1, fin);
        }
    }

    private char[] intToChar(int[] arrayCharToInt) {
        val covertidoChar= new char[arrayCharToInt.length];
        for (var i = 0; i < arrayCharToInt.length; i++) {
            covertidoChar[i]= (char)(arrayCharToInt[i]+48);
        }

        return covertidoChar;
    }

    private int[] charToInt(char[] listaChar2) {
        val covertidoInt= new int[listaChar2.length];
        for (var i = 0; i < listaChar2.length; i++) {
            covertidoInt[i]= (int)listaChar2[i]-48;
        }
        return covertidoInt;
    }
}
