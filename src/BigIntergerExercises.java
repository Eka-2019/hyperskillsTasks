import java.math.BigInteger;
import java.util.Scanner;

public class BigIntergerExercises {


    public static void main(String[] args) {
        //Big Integer expression
        /**
         * Write a program that reads four large integers a, b, c, d and outputs the result of the expression
         *
         * (-a) * b + c - d
         *
         * Input data format
         *
         * The single line contains four numbers separated by spaces.
         *
         * Output data format
         *
         * The single line that contains the result.
         * Sample Input 1:
         * -9999999999999999 10000000000000000 20000000000000000 9999999999999999
         * Sample Output 1:
         * 100000000000000000000000000000001
         * @param args
         */

        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();

        BigInteger a1 = a.negate();
        BigInteger result = a1.multiply(b).add(c).subtract(d);

        System.out.println(result);

    }
}


class BigIntComparingNums {

    /**
     * A programmer wrote a method for checking at least two given BigInteger numbers are equal.
     * But he has made several mistakes and the method works incorrectly. Try to fix it.
     */

    public static class Main {

        /**
         * It returns true if at least two of three given numbers are equal, otherwise - false.
         */
        public static boolean atLeastTwoAreEqual(BigInteger num1, BigInteger num2, BigInteger num3) {
            return (num1.equals(num2) || num2.equals(num3) || num1.equals(num3)); // fix this line
        }

        /* Do not change code below */
        public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);

            final String[] parts = scanner.nextLine().split("\\s+");

            BigInteger num1 = null;
            BigInteger num2 = null;
            BigInteger num3 = null;

            try {
                num1 = new BigInteger(parts[0]);
                num2 = new BigInteger(parts[1]);
                num3 = new BigInteger(parts[2]);
            } catch (Exception e) {
                System.out.println("Can't parse a big integer value");
                e.printStackTrace();
            }

            System.out.println(atLeastTwoAreEqual(num1, num2, num3) ? "YES" : "NO");
        }
    }
}