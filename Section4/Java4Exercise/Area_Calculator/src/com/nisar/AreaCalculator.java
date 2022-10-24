package com.nisar;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5,4));
        System.out.println(area(7));

    }
    public static double area(double radius){
        if (radius<0){
        return -1.0;
        }
        return  Math.PI * Math.pow(radius,2);
    }
    public static double area(double x,double y) {
        if (x<0 || y<0){
return -1.0;
        }return  x*y;
    }

    }
