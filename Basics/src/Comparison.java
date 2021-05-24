import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter first integer: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second integer: ");
        num2 = sc.nextInt();

        if(num1 == num2)
            System.out.println(num1 + " = "+ num2+ " : Equal");
        if(num1 != num2)
            System.out.println(num1 + "!"+ num2+ " : Not Equal");
        if(num1 < num2)
            System.out.println(num1 + " < "+ num2 + "Less than");
        if(num1>num2)
            System.out.println(num1 + " > "+ num2 + "Greater than");
        
    }
}
