package Methods;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for(int counter = 1; counter<=20; counter++){
            //pick a random integer from 1 to 6
            int face = 1+randomNumbers.nextInt(6);
            System.out.printf("%d ", face);

            if (counter%5 == 0){
                System.out.println();//only for asthetic purpose
            }
        }
    }
}
