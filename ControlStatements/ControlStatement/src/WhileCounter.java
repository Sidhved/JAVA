package ControlStatements.ControlStatement.src;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;        //declare and initialize control variable

        while (counter <= 10) {
            System.out.printf("%d ", counter);
            ++counter;  //incrementing control variable
        }
        System.out.println();
    }
}
