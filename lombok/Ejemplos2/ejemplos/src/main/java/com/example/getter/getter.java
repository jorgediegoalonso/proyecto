package com.example.getter;

public class getter {
    public static void main(String[] args) {
        objetoJava obj= new objetoJava();
        System.out.println("Java\n");
        System.out.println("Numero: "+obj.getNum()+"\nValido: "+obj.getValid()+"\nTexto: "+obj.getTexto());
        System.out.println("--------------------------------------------------------------------\n");

        objetoLombok objLom= new objetoLombok();
        System.out.println("Lombok\n");
        System.out.println("Numero: "+objLom.getNum()+"\nValido: "+objLom.isValid()+"\nTexto: "+objLom.getTexto());

    }
}
