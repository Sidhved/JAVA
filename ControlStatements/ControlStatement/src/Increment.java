package ControlStatements.ControlStatement.src;

public class Increment {
    public static void main(String[] args) {
        //postfix increment operator
        int c = 5;
        System.out.printf("c before post increment: %d%n", c);
        System.out.printf("post incrementing c: %d%n", c++);
        System.out.printf("c after postincrement: %d%n", c);

        System.out.println();

        //prefix increment operator
        System.out.printf("c before preincrement: %d%n", c);
        System.out.printf("preincrementing c: %d%n", ++c);
        System.out.printf("after preincrementing c: %d%n", c);
    }
}
