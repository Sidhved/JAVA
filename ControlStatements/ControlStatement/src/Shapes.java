package ControlStatements.ControlStatement.src;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shapes extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i = 0; i<10; i++){
            g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
            g.drawOval(240+i*10, 10+i*10, 50+i*10, 50+i*10);
        }
    }
    public static void main(String[] args) {
        Shapes panel = new Shapes();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 290);
        app.setVisible(true);

        Circles pane = new Circles();
        JFrame apply = new JFrame();

        apply.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        apply.add(pane);
        apply.setSize(500, 500);
        apply.setVisible(true);
    }
}
