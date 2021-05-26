package Methods;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 floating point numbers");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        double res = maximum(d1, d2, d3);
        System.out.println("Maximum is: "+res);
    }

    public static double maximum(double d1, double d2, double d3){
        double max = d1;
        if(d2>max){
            max = d2;
        }
        if(d3>max){
            max = d3;
        }
        return max;
    }
}
