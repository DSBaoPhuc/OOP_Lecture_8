/*
 Tran Bao Phuc 
 ITDSIU21109
 Assignment 5 OOP
 Lecture 8
*/

import javax.swing.JFrame;

public class TestDrawPanel_Line {
    public static void main(String[] args) {
        DrawPanel_Line panel = new DrawPanel_Line();
        JFrame app =  new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
