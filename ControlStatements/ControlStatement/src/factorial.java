package ControlStatements.ControlStatement.src;

import java.lang.Math;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class factorial {
    public static int fact(int m){
        if(m == 0)
            return 1;
        else{
            int f = 1;
            for(int i = 1; i<=m; i++){
                f *= i;
            }
            return f;            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int res = fact(n);  
        System.out.printf("%nFactorial of %d is : %d", n, res);
        System.out.printf("%nEnter the number of terms for calculating sum of taylor series: ");
        int num = sc.nextInt();
        System.out.print("%nEnter the power of e: ");
        int x = sc.nextInt();
        double e = 0;
        double ex = 0;
        for(int i = 0; i<=num; i++){
            e += 1/(fact(i));
            ex += Math.pow(x,i)/fact(i);
        }
        System.out.printf("%ne = %f.2%n",e);
        System.out.printf("%ne^x = %f.2%n", ex);
    }
}
