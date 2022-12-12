package authenicator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author nisar
 */
public class Authenicator {

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Username");
        String password = JOptionPane.showInputDialog("Password");

        if (!(username == null && password == null)
                && ((username.equals("bburd") && password.equals("swordfish"))
                || (username.equals("hritter") && password.equals("preakston")))) {
            JOptionPane.showMessageDialog(null, "You are in");
        } else {
            JOptionPane.showMessageDialog(null, "not enough information");
        }
    }

}
