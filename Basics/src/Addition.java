package Basics.src;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.print("Enter first integer: ");
        num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.printf("Sum is %d", sum);  // YAY i can use printf here
    } 
}
