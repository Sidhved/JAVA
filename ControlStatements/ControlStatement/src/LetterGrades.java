package ControlStatements.ControlStatement.src;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradecounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("%s%n%s%n     %s%n    %s%n","Enter the integer grades in the range 0-100", "Type the end-of-file indicator to terminate input: ", "On Unix/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");

        while(sc.hasNext()){
            int grade = sc.nextInt();
            total += grade;
            ++gradecounter;

            switch (grade/10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                case 6:
                    ++dCount;
                    break;
            
                default:
                    ++fCount;
                    break;
            }
        }

        System.out.printf("%nGrade Report: %n");
        if (gradecounter != 0){
            double avg = (double) total/gradecounter;
            System.out.printf("Total of the %d grades entered is %d%n", gradecounter, total);
            System.out.printf("Class Average: %.2f%n", avg);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of studentswho received each grade: ", "A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount, "F: ", fCount);
        }
        else{
            System.out.println("No grades were entered!");
        }
    }
}
