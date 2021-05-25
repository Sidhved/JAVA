package ControlStatements.ControlStatement.src;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circles extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        for (int i = 1; i<=12; i++){
            g.drawOval((width/2)-(i*5), (height/2)-(i*5), 10+i*10, 10+i*10);
        }
    }
    public static void main(String[] args) {
        Circles pan = new Circles();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(pan);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}
