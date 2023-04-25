/*
 Tran Bao Phuc 
 ITDSIU21109
 Assignment 5 OOP
 Lecture 8
*/

import javax.swing.JOptionPane;

public class Namedialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        String message = String.format("Welcome, %s, to java Programing!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
