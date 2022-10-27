package com.nisar;

public class Main {
    public static void main(String[] args) {
         Car porsche = new Car();
         Car Holden = new Car();
        Car Nissan = new Car();
/*       bad practice contrast w/ encapsulation OOP
         porsche.model = "Carrera";
*/
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        Holden.setModel("Commodore");
        System.out.println("Model is "+ Holden.getModel());
        Holden.setModel("Commodo");
        System.out.println("Model is "+ Holden.getModel());
    }
}