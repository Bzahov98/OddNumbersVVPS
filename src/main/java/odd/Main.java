package odd;

import odd.exeption.InvalidParameterException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Sum of odd numbers 0,10 is: " + OddNumberUtils.sumOddNumbers(0, 10));

            System.out.println("Sum of odd numbers 0,50 is: " + OddNumberUtils.sumOddNumbers(0, 50));

            System.out.println("Sum of odd numbers 0,100 is: " + OddNumberUtils.sumOddNumbers(0, 100));
        } catch (InvalidParameterException e) {
            System.err.println("Invalid Arguments "+ e);
        }
    }


}
