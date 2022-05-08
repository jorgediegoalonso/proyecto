package com.example.setter;

public class objetoJava {
    private int num=345;
    private boolean valid=false;
    private String texto= "Mi texto";

    public int getNum(){
        return num;
    }
    public boolean getValid(){
        return valid;
    }
    public String getTexto(){
        return texto;
    }

    public void setNum(int num){
        this.num= num;
    }

    public void setValid(Boolean valid){
        this.valid= valid;
    }

    public void setTexto(String texto){
        this.texto= texto;
    }
    
}
