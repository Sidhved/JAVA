package ControlStatements.ControlStatement.src;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //initialization phase
        int total = 0;
        int gradeCounter = 1;

        //processing phase uses counter controlled repetition
        while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");
            int grade = sc.nextInt();
            total += grade;
            gradeCounter++;
        }

        //termination phase
        int avg = total/10;

        //display total and avg grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class Average is %d%n", avg);
    }
}
