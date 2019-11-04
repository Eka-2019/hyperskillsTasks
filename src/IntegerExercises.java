import java.util.Scanner;

public class IntegerExercises {

    public static void main(String[] args) {
        snail();
        reversing();
        nextEvenNumber();
        differentOfTimes();
        goodRestOnVacation();
        theNumberOfTens();
        squrrelsAndNuts();
        firstDigit();
        desk();
        theSumOfDigits();

    }

    public static void snail() {
        // Snail
        /**
         * Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down.
         * In which day the snail will reach the top of the pole?
         *
         * Input data format
         *
         * On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
         *
         * Sample Input 1:
         * 10
         * 3
         * 2
         * Sample Output 1:
         * 8
         * Sample Input 2:
         * 20
         * 7
         * 3
         * Sample Output 2:
         * 5
         */

        Scanner scanner = new Scanner(System.in);
        int numH = scanner.nextInt();
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        int result = numA;
        int count = 1;

        for (int i = numA; result < numH; i++) {
            result = result + (numA - numB);
            count++;
        }
        System.out.println(count);
    }

    public static void reversing() {
        //   Reversing
        /**
         *Write a program that reads a three digit number, calculates the new number by reversing its digits, and outputs a new number.
         *
         * Sample Input 1:
         * 976
         * Sample Output 1:
         * 679
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = num / 100;
        int num2 = (num % 100) / 10;
        int num3 = (num % 100) % 10;
        int reverse = num3 * 100 + num2 * 10 + num1;

        System.out.println(reverse);

    }

    public static void nextEvenNumber() {
        //  Next even number

        /**
         * Given a natural number, not greater than 10000. Output the even number following this number.
         *
         * Hint
         * Sample Input 1:
         * 7
         * Sample Output 1:
         * 8
         * Sample Input 2:
         * 8
         * Sample Output 2:
         * 10
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int result = 0;
        if (num % 2 > 0) {
            result = num + 1;
        } else {
            result = num + 2;
        }

        System.out.println(result);

    }

    public static void nextEvenNumberSampleSolution() {
        // correct decision
        final Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        final int nextEven = ((number + 2) / 2) * 2;
        System.out.println(nextEven);
    }

    public static void differentOfTimes() {
        //  Difference of times
        /**
         * Given the values of the two moments in time in the same day: hours, minutes and seconds for each of the time moments. It is known that the second moment in time happened not earlier than the first one. Find how many seconds passed between these two moments of time.
         *
         * Input data format
         *
         * The program gets the input of the three integers: hours, minutes, seconds, defining the first moment of time and three integers that define the second moment time.
         *
         * Output data format
         *
         * Output the number of seconds between these two moments of time.
         *
         * Sample Input 1:
         * 1
         * 1
         * 1
         * 2
         * 2
         * 2
         * Sample Output 1:
         * 3661
         * Sample Input 2:
         * 1
         * 2
         * 30
         * 1
         * 3
         * 20
         * Sample Output 2:
         * 50
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hours1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();
        int firstMom = hours1 * 3600 + min1 * 60 + sec1;
        int secondMom = hours2 * 3600 + min2 * 60 + sec2;

        System.out.println(secondMom - firstMom);
    }

    public static void goodRestOnVacation() {
        //   Good rest on vacation
        /**
         * Write a program that will help people who are going on vacation. The program should calculate the total required sum (e.g. $) of money to have a good rest for a given duration.
         *
         * There are four parameters which have to be considered:
         * duration in days
         * total food cost per a day
         * one-way flight cost
         * cost of one night in a hotel (the number of nights equal duration minus one)
         * Read values of these parameters from the standard input and then print the result.
         *
         * Sample Input 1:
         * 7 30 100 40
         * Sample Output 1:
         * 650
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        String[] n = scanner.nextLine().split(" ");
        Integer n1 = Integer.valueOf(n[0]);
        Integer n2 = Integer.valueOf(n[1]);
        Integer n3 = Integer.valueOf(n[2]);
        Integer n4 = Integer.valueOf(n[3]);

        System.out.println(n1 * n2 + n3 * 2 + (n1 - 1) * n4);
    }

    public static void theNumberOfTens() {
        //  The number of tens

        /**
         * Given a non-negative integer N (0 ≤ N ≤ 1000000), find the number of tens in it (i.e. next to last digit of the number). If there is no next to last digit, you can consider that the number of tens equals to zero.
         *
         * Sample Input 1:
         * 173
         * Sample Output 1:
         * 7
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int n2 = (n % 100) / 10;
        System.out.println(n2);

    }

    public static void squrrelsAndNuts() {
        //  Squirrels and nuts

        /**
         * N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.
         *
         * Input data format
         *
         * There are two positive integers N and K, each of them is not greater than 10000.
         *
         * Sample Input 1:
         * 3
         * 14
         * Sample Output 1:
         * 2
         */
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numOfSqu = scanner.nextInt();
        int numOfNut = scanner.nextInt();
        System.out.println(numOfNut % numOfSqu);
    }

    public static void firstDigit() {
        //   First digit

        /**
         * Given a two-digit number. Print its first digit (i.e. the number of tens).
         *
         * Sample Input 1:
         * 42
         * Sample Output 1:
         * 4
         */
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int n2 = (n % 100) / 10;
        System.out.println(n2);
    }

    public static void desk() {
        //   Desks

        /**
         * A university has decided to open math courses and equip classrooms for 3 groups with special new desks. The faculty agreed that in the sake of productivity only two students may share one table. The enrolment has ended, and now the task is to count the number of desks to order the correct amount from the shop. Of course, the university is short of money, so you need to calculate the minimum of desks. But don't forget that each group will sit in its own classroom!
         *
         * Input data format
         *
         * The program receives the input of the three non-negative integers: the number of students in each of the three groups (the numbers is not bigger than 1000).
         *
         * Sample Input 1:
         * 20
         * 21
         * 22
         * Sample Output 1:
         * 32
         * Sample Input 2:
         * 16
         * 18
         * 20
         * Sample Output 2:
         * 27
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int num1 = group1 / 2;
        int num2 = group2 / 2;
        int num3 = group3 / 2;

        if (group1 % 2 > 0) {
            num1 = num1 + 1;
        }
        if (group2 % 2 > 0) {
            num2 = num2 + 1;
        }
        if (group3 % 2 > 0) {
            num3 = num3 + 1;
        }
        System.out.println(num1 + num2 + num3);
    }

    public static void deskSampleSolution() {
        // Desk (correct decision)

        final Scanner sc = new Scanner(System.in);
        final int st1 = sc.nextInt();
        final int st2 = sc.nextInt();
        final int st3 = sc.nextInt();

        final int results = st1 / 2 + st1 % 2 + st2 / 2 + st2 % 2 + st3 / 2 + st3 % 2;

        System.out.println(results);

    }

    public static void theSumOfDigits() {
        //  The sum of digits

        /**
         * Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
         *
         * Sample Input 1:
         * 476
         * Sample Output 1:
         * 17
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int n1 = n / 100;
        int n2 = (n % 100) / 10;
        int n3 = n % 10;
        System.out.println(n1 + n2 + n3);
    }


}
