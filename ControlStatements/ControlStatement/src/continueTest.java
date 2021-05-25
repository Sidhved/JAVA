package ControlStatements.ControlStatement.src;

public class continueTest {
    public static void main(String[] args) {
        for(int count = 1; count<=10; count++){
            if(count == 5)
                continue;
            System.out.printf("%d ", count);
        }
        System.out.printf("%nUsed Continue to skip printing 5%n");
    }
}
