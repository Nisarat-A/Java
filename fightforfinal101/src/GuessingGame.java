/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

/**
 *
 * @author nisar
 */
public class GuessingGame {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter an int from 1 to 10 : ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(6) + 1;
        if (inputNumber == randomNumber) {
            out.println("*******");
            out.println("*You win*");
            out.println("*******");
        } else {
            out.println("You lose. ");
            out.print("The random number was ");
            out.println(randomNumber + ".");
        }
        out.println("Thank you for playing");
        keyboard.close();
    }
}
