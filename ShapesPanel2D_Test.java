/*
 Tran Bao Phuc 
 ITDSIU21109
 Assignment 5 OOP
 Lecture 8
*/

import javax.swing.JFrame;

public class ShapesPanel2D_Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShapesJPanel shapesJPanel = new ShapesJPanel();

        frame.add(shapesJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);

    }
}
