package ControlStatements.ControlStatement.src;

public class logicalOperators {
    public static void main(String[] args) {
        System.out.printf("Conditional AND (&&) %nFalse&&False: %b%nFalse&&True: %b%nTrue&&False: %b%nTrue&&True: %b", false&&false, false&&true, true&&false, true&&true);
        System.out.println();
        System.out.printf("Conditional OR(||) %nFalse||False: %b%nFalse||True: %b%nTrue||False: %b%nTrue||True: %b", false||false, false||true, true||false, true||true);
        System.out.println();
        System.out.printf("Boolean Logical AND (&) %nFalse&False: %b%nFalse&True: %b%nTrue&False: %b%nTrue&True: %b", false&false, false&true, true&false, true&true);
        System.out.println();
        System.out.printf("Boolean Logical Inclusive OR (|) %nFalse|False: %b%nFalse|True: %b%nTrue|False: %b%nTrue|True: %b", false|false, false|true, true|false, true|true);
        System.out.println();
        System.out.printf("Boolean Logical Exclusive OR (^) %nFalse^False: %b%nFals^True: %b%nTrue^False: %b%nTrue^True: %b", false^false, false^true, true^false, true^true);
        System.out.println();
        System.out.printf("Logical Not (!) %n!False: %b%n!True: %b", !false, !true);
    }
}
