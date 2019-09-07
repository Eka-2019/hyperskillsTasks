import java.math.BigInteger;
import java.util.Scanner;


public class BigIntExpression {

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

    public static void main(String[] args) {
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
