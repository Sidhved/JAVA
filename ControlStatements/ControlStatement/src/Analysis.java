package ControlStatements.ControlStatement.src;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        //process 10 students using counter-controlled loop
        while(studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = sc.nextInt();

            if(result == 1)
                passes++;
            else
                failures++;

            studentCounter++;
        }
        System.out.printf("%nPassed : %d%nFailed: %d%n", passes, failures);

        if(passes > 8){
            System.out.println("Bonus to the faculty!");
        }
    }
}
