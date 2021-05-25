package ControlStatements.ControlStatement.src;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GUIPattern3 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        for(int i =0; i<15; i++){
            g.drawLine(0, (i*height/15), (i*width/15), height);
            g.drawLine((i*width/15), 0, 0, height-(i*height/15));
            g.drawLine(width, width-(i*height/15), (i*width/15), height);
            g.drawLine((i*width/15), 0, width, (i*height/15));
        }
    }
}
