package com.example.setter;

public class setter {
    public static void main(String[] args) {
        objetoJava obj= new objetoJava();
        

        System.out.println("Java\n");
        obj.setNum(2);
        obj.setTexto("texto nuevo");
        obj.setValid(true);
        System.out.println("1.Numero: "+obj.getNum()+"\n2.Texto: "+obj.getTexto()+"\n3.Valido: "+obj.getValid());       
        System.out.println("--------------------------------------------------------------------\n");

        objetoLombok obj2= new objetoLombok();
        obj2.setNum(5);
        obj2.setTexto("texto lombok");
        obj2.setValid(false);
        System.out.println("Lombok\n");
        System.out.println("1.Numero: "+obj2.getNum()+"\n2.Texto: "+obj2.getTexto()+"\n3.Valido: "+obj2.isValid());       

    }
}
