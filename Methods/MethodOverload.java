package Methods;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
    }
    public static int square(int intValue){
        System.out.printf("%nCalled square with int arguement: %d%n", intValue);
        return intValue*intValue;
    }
    public static double square(double doubleValue){
        System.out.printf("%nCalled square with double arguement: %f%n", doubleValue);
        return doubleValue*doubleValue;
    }
}
