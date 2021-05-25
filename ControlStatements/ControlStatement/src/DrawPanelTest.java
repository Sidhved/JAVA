package ControlStatements.ControlStatement.src;

import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        //create new frame to hold panel
        JFrame app = new JFrame();
        //set the frme to exit when closed
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.add(panel);
        app.setSize(250, 250);
        app.setVisible(true);

        GUIPattern2 pan = new GUIPattern2();
        //create new frame to hold panel
        JFrame app1 = new JFrame();
        //set the frme to exit when closed
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app1.add(pan);
        app1.setSize(500, 500);
        app1.setVisible(true);

        GUIPattern3 pat = new GUIPattern3();
        //create new frame to hold panel
        JFrame app2 = new JFrame();
        //set the frme to exit when closed
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app2.add(pat);
        app2.setSize(500, 500);
        app2.setVisible(true);
    }
}
