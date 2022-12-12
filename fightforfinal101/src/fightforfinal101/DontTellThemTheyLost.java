/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightforfinal101;

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 *
 * @author nisar
 */
public class DontTellThemTheyLost {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        out.print("Enter an int from 1 to 10 : ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            out.println("*You win.*");
        }
        out.println("That was a very good guess: - ");
        out.print("The random number was ");
        out.print(randomNumber + " . ");
        out.println("Thank you for playing. ");
        keyboard.close();
    }
}
