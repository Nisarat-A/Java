/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authenicator;

import java.util.Scanner;
import static java.lang.System.*;

/**
 *
 * @author nisar
 */
public class Authenicator2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("bburd")) {
            out.print("Password: ");
            String password = keyboard.next();
            if (password.equals("swordfish")) {
                out.println("you're in");
            } else {
                out.println("incorrect password");
            }
        } else {
            out.println("unknown user");
        }
    }
}
