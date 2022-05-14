package com.example;

public class ejemploNoArgsConstructorJava {
    private int a;
    private long b;
    private String c;
    private boolean d;

    public ejemploNoArgsConstructorJava(){

    }

    public void setA(int a){
        this.a=a;
    }
    public void setB(Long b){
        this.b=b;
    }
    public void setC(String c){
        this.c=c;
    }
    public void setD(Boolean d){
        this.d=d;
    }

    @Override
    public String toString() {
        return "ejemploNoArgsConstructorJava(a="+a+" ,b="+b+" ,c="+c+" ,d="+d+")";
    }
}
