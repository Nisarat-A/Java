/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightforfinal101;

import static java.lang.System.out;

/**
 *
 * @author nisar
 */
public class MakeChange {

    public static void main(String[] args) {
        int total = 248;
        int quarters = total / 25;
        int whatsleft = total % 25;

        int dimes = whatsleft / 10;
        whatsleft = total % 10;

        int nickels = whatsleft / 5;
        whatsleft = total % 5;

        int cents = whatsleft;

        out.println("From " + total + " cents you get ");
        out.println(quarters + "quarters");
        out.println(dimes + "dimes");
        out.println(nickels + "nickels");
        out.println(cents + "cents");

    }
        
        
    }

