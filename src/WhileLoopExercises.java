import java.math.BigInteger;
import java.util.Scanner;

public class WhileLoopExercises {

    public static void main(String[] args) {
        //   Squares of natural numbers
        /**
         * Given integer N. Print all the squares of natural numbers, not exceeding N, in ascending order.
         *
         * Sample Input 1:
         * 50
         * Sample Output 1:
         * 1
         * 4
         * 9
         * 16
         * 25
         * 36
         * 49
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int num = 0;
        int result = 0;

        while (result <= a) {
            num += 1;
            result = num * num;
            if (result > a) {
                break;
            }

            System.out.println(result);
        }

    }

    public static void main7(String[] args) {
        //   The smallest value
        /**
         * A user inputs a long number M.
         * You need to find out what is the smallest long number n such that n! > M.
         *
         * Sample Input 1:
         * 6188989133
         * Sample Output 1:
         * 13
         */
        Scanner scan = new Scanner(System.in);
        BigInteger fact = scan.nextBigInteger();
        BigInteger newFact = BigInteger.valueOf(1);

        BigInteger count = BigInteger.valueOf(1);

        while (newFact.compareTo(fact) == -1 || newFact.compareTo(fact) == 0) {
            count = count.add(BigInteger.ONE);
            newFact = newFact.multiply(count);

        }
        System.out.println(count);

    }

    public static void main6(String[] args) {
        //    Profit
        /**
         * Ann put M money in the bank. The bank increases Ann's deposit by P percent every year.
         * Ann wants to know how many years should pass until her deposit in the bank reaches K money.
         * Can you help her to answer this question?
         * Input contains three integers - M,P,K. It is guaranteed that all numbers are positive and
         * K≥M.
         * Output the answer to Ann's question.
         * Sample Input 1:
         * 1 100 8
         * Sample Output 1:
         * 3
         * Sample Input 2:
         * 100 15 120
         * Sample Output 2:
         * 2
         */

        // write your code here
        Scanner scan = new Scanner(System.in);
        double m = scan.nextInt();
        double p = scan.nextInt();
        double k = scan.nextInt();

        int count = 0;
        while (m < k) {
            m = m + m*p/100;
            count++;
        }
        System.out.print(count);
    }


    public static void main5(String[] args) {
        //   Collatz conjecture
        /**
         * Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
         * If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.
         * For example, if the number n = 17, then the sequence looks as the following:
         * 17 52 26 13 40 20 10 5 16 8 4 2 1
         * Such a sequence will stop at number 1 for any primary natural number n.
         *
         * Output format:
         * Sequence of integers in a single line, separated by spaces.
         *
         * Sample Input 1:
         * 17
         * Sample Output 1:
         * 17 52 26 13 40 20 10 5 16 8 4 2 1
         * Sample Input 2:
         * 1
         * Sample Output 2:
         * 1
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print(a + " ");

        while (a > 1) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = a * 3 + 1;
            }
            System.out.print(a + " ");
        }

    }


    public static void main4(String[] args) {
        //    The largest element of a sequence
        /**
         * Given the sequence of integer numbers (which ends with the number 0). Find the largest element of the sequence.
         *
         * The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
         *
         * Sample Input 1:
         * 1
         * 7
         * 9
         * 0
         * Sample Output 1:
         * 9
         */

        // put your code here

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int max = 0;

        while(a!=0){
            if(max<a){
                max = a;
            }
            a=scan.nextInt();
        }
        System.out.println(max);
    }


    public static void main3(String[] args) {
        //    The sum of elements
        /**
         * Find the sum of all elements of a sequence, ending with the number 0.
         *
         * The number 0 itself is not included into the sequence and serves as a sign of cessation.
         *
         * Sample Input 1:
         * 3
         * 6
         * 8
         * 0
         * Sample Output 1:
         * 17
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;

        while(a!=0){
            sum +=a;
            a=scan.nextInt();
        }
        System.out.println(sum);
    }

    public static void main2(String[] args) {
        //   The sequence
        /**
         * Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. As input, the program gets the number of elements in the sequence, and then the elements themselves. In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000. The program should print a single number: the maximum element of the sequence divisible by 4.
         *
         * Sample Input 1:
         * 10
         * 76
         * 18
         * 69
         * 63
         * 36
         * 18
         * 49
         * 16
         * 12
         * 50
         * Sample Output 1:
         * 76
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int max = 0;
        int i=0;

        while(i<a){
            int b = scan.nextInt();
            if(b%4==0 && max<b){
                max = b;
            }
            i++;
        }
        System.out.println(max);
    }


    public static void main1(String[] args) {
        //    The length of the sequence
        /**
         * For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).
         *
         * Don’t read numbers following the number 0.
         *
         * Sample Input 1:
         * 1
         * 7
         * 9
         * 0
         * 5
         * Sample Output 1:
         * 3
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        do {
            if(a!=0) {
                a = scan.nextInt();
                count++;
            }
        }
        while (a != 0);
        System.out.println(count);

    }



}
