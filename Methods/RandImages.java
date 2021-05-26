package Methods;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandImages extends JPanel {
    SecureRandom randomNumber = new SecureRandom();
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        boolean flag = true;
        int width = getWidth();
        int height = getHeight();
        int x = randomNumber.nextInt(width);
        int y = randomNumber.nextInt(height);
        int p = randomNumber.nextInt(width/2);
        int q = randomNumber.nextInt(height/2);
        while (flag == true) {
            for(int i = 1; i<=10; i++){
                int col = 1 + randomNumber.nextInt(2);
                int r = randomNumber.nextInt(5);
                switch(r){
                    case 1:
                        g.setColor(Color.BLACK);
                        break;
                    case 2:
                        g.setColor(Color.BLUE);
                        break;
                    case 3:
                        g.setColor(Color.CYAN);
                        break;
                    case 4:
                        g.setColor(Color.GRAY);
                        break;
                    case 5:
                        g.setColor(Color.MAGENTA);
                        break;
                }
                switch (col) {
                    case 1:
                        g.fillRect(x, y, p, q);
                        break;
                    case 2:
                        g.fillOval(x, y, p, q);
                        break;
                    default:
                        break;
                }
                if(i == 10){
                    flag = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        RandImages panel = new RandImages();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }
}
