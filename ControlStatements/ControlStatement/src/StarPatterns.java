package ControlStatements.ControlStatement.src;

public class StarPatterns {
    public static void main(String[] args) {
        for(int i =1; i<=10; i++){      //Pattern a
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 10; i>=1; i--){     //Pattern b
            for(int j = i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 10; i>=1; i--){     //Pattern c
            for(int j = 10; j>=1; j--){
                if(j<=i){
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 10; i>=1; i--){     //Pattern d
            for(int j = 1; j<=10; j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
