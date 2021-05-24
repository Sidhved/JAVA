package ControlStatements.ControlStatement.src;

import java.util.Scanner;

public class classAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("ENter grade or -1 to quit: ");
        int grade = sc.nextInt();

        while (grade != -1) {
            total += grade;
            gradeCounter++;
            System.out.print("Enter grade or -1 to quit: ");
            grade = sc.nextInt();
        }

        if(gradeCounter != 0){
            double avg = (double) total/gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", avg);
        }
        else
        System.out.println("No grades were entered");
    }
}
