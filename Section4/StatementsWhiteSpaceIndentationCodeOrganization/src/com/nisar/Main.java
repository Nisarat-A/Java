package com.nisar;

/**
 * Code Organization
 * 1.Statement
 * 2.WhiteSpace
 * 3.Indentation
 */
public class Main {
    public static void main(String[] args) {
        int myVariable
                =
                50; //this one also can but shouldn't
        if (myVariable == 50) {
            System.out.println("printed");
        }
        //concept of indentation is to be more readable
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is " +      //help more readable
                "another" +
                " still more"
        );
        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one"); // should not

/**
 *  reformat code to mode readable use crl + alt + L
 *  code>reformat code
 */
        // expression myVariable = 50
        // **Statement is the entire line**
        // int myVariable = 50 ;
        // semicolon is very important to complete Java Statements;



    }
}