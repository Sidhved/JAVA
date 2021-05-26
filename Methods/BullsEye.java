package Methods;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BullsEye extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        for (int i = 5; i > 0; i--) {
            if(i%2 == 0){
                g.setColor(Color.RED);
            }
            else{
                g.setColor(Color.CYAN);
            }
            g.fillOval((width/2)-(i*10), (height/2)-(i*10), 20+i*20, 20+i*20);
        }
    }
    public static void main(String[] args) {
        BullsEye panel = new BullsEye();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }
}
