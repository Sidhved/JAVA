package ControlStatements.ControlStatement.src;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        //draw line from upperleft to lower left
        g.drawLine(0, 0, width, height);
        //draw line from lowerleft to uper right
        g.drawLine(0, height, width, 0);
    }
}
