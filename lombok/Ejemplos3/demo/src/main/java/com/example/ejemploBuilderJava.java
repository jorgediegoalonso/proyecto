package com.example;

import java.util.ArrayList;
import java.util.Collection;

public class ejemploBuilderJava {
    private long creado;
    private String nombre;
    private int edad;
    private ArrayList<String> ocupaciones;

    ejemploBuilderJava(long creado,int edad,String nombre,ArrayList<String> ocupaciones){
        this.edad=edad;
        this.creado=creado;
        this.ocupaciones=ocupaciones;
        this.nombre=nombre;
    }

    public ejemploBuilderJava() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private static long $defaul$created(){
        return System.currentTimeMillis();
    }

    public static class Builder{
        private long creado;
        private String nombre;
        private int edad;
        private ArrayList<String> ocupaciones;
        private boolean created$set;


        Builder(){

        }

        public Builder creado(long creado){
            this.creado=creado;
            this.created$set=true;
            return this;
        }
        public Builder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
        public Builder edad(int edad){
            this.edad=edad;
            return this;
        }
       
       public Builder ocupaciones(String ocupaciones){
            if (this.ocupaciones==null) {
               this.ocupaciones= new ArrayList<>();               
            }

            this.ocupaciones.add(ocupaciones);
            return this;
        }  
        
        public Builder ocupaciones(Collection <? extends String> ocupaciones){
            if (this.ocupaciones==null) {
                this.ocupaciones= new ArrayList<>();               
             }
 
             this.ocupaciones.addAll(ocupaciones);
            return this;
        }
        public Builder ocupacionesClear(){
            if (this.ocupaciones!=null) {
                this.ocupaciones.clear();         
             }
            return this;
        }

        public ejemploBuilderJava build(){
            return new ejemploBuilderJava(created$set? creado: ejemploBuilderJava.$defaul$created(),edad,nombre,ocupaciones);
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ejemploBuilderJava(Creado= "+this.creado+" ,Edad= "+this.edad+" ,Nombre= "+this.nombre+" ,Ocupaciones= "+this.ocupaciones+")";
    }
}
