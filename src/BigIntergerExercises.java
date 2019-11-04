import java.math.BigInteger;
import java.util.Scanner;

public class BigIntergerExercises {

    public static void main(String[] args) {
        smallestValueOfFactorial();
        calcDoubleFactorial(7);
        expressionWithLargeNumber();
    }

    public static void smallestValueOfFactorial() {
        //The smallest value of Factorial
        /**
         * A user inputs a long number M. You need to find out what is the smallest long n, so that n! >= M.
         * Use the BigInteger class to solve the problem. Otherwise, your solution won't pass all the tests.
         * Do not forget to import all the needed classes.
         * Just in case: wiki on factorials.
         */
        // put your code here
        Scanner scan = new Scanner(System.in);
        BigInteger factorial = scan.nextBigInteger();
        BigInteger newFactorial = BigInteger.valueOf(1);

        BigInteger count = BigInteger.valueOf(1);

        while (newFactorial.compareTo(factorial) == -1) {
            count = count.add(BigInteger.ONE);
            newFactorial = newFactorial.multiply(count);

        }

        System.out.println(count);
    }

    public static BigInteger calcDoubleFactorial(int n) {
        //  Double factorial

        /**
         * Implement a function to compute the double factorial, that is the product of natural numbers with
         * the same parity and not exceeding a given number.
         *
         * For example:
         * 7!!=7⋅5⋅3⋅1
         * 8!!=8⋅6⋅4⋅2
         *
         * The function argument can be any non-negative integer.
         *
         * Use BigInteger to solve the problem.
         *
         * Sample Input 1:
         * 7
         * Sample Output 1:
         * 105
         */

        // type your java code here
        BigInteger doubleFact = BigInteger.valueOf(1);
        if (n % 2 > 0) {
            for (; n > 0; n = n - 2) {
                doubleFact = doubleFact.multiply(BigInteger.valueOf(n));
            }
            return doubleFact;
        } else {
            for (; n > 1; n = n - 2) {
                doubleFact = doubleFact.multiply(BigInteger.valueOf(n));
            }
            return doubleFact;
        }
    }

    public static void expressionWithLargeNumber() {
        //    An expression with large numbers
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
