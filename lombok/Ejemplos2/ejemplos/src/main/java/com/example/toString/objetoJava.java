package com.example.toString;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;

public class objetoJava {
    private static final int num=10;
    private final String name="Rectangulo"; 
    private final String[] tags = {"Geometry","Math","Square"};
    private final Shape shape= new Square(5, 10);
    private final int id= 1;

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "objetoJava(name="+this.name+" , shape="+this.shape+" , tags="+Arrays.deepToString(this.tags)+" , id="+this.id+")";
    }

    public static class Square implements Shape{

        private final int width,height;

        public Square(int width, int height) {
            this.width=width;
            this.height=height;
        }

        @Override
        public String toString() {
            return "Square(super="+super.toString()+" , width="+this.width+" , height="+this.height+")";
        }

        @Override
        public Rectangle getBounds() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Rectangle2D getBounds2D() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean contains(double x, double y) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean contains(Point2D p) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean intersects(double x, double y, double w, double h) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean intersects(Rectangle2D r) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean contains(double x, double y, double w, double h) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean contains(Rectangle2D r) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at, double flatness) {
            // TODO Auto-generated method stub
            return null;
        }
        
    }
}
