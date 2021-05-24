import java.util.Scanner;

import javax.swing.JOptionPane;

//to claculate the product of 3 integers

public class PrdOf3Ints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, y, z, result;
        System.out.print("Enter the first integer: ");
        x = sc.nextInt();
        System.out.print("Enter the second integer: ");
        y = sc.nextInt();
        System.out.print("ENter the third integer: ");
        z = sc.nextInt();
        result = x*y*z;
        System.out.println("Result = "+result);
        String res = String.format("Result = %d", result);
        JOptionPane.showMessageDialog(null, res);
    }
}
