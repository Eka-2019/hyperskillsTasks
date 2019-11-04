import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RelationalOperatorsExercises {

    public static void main(String[] args) {
        groundhogsParty();
        isBetween();
        checkTheSum();
        checkTheGivenNumberAreDifferent();
        exactlyOneParameterIsPositive();
        boysInASportClass();
    }

    public static void groundhogsParty() {
        //    Groundhogs at a party
        /**
         * Groundhogs like to throw fun parties, and at their parties, they like to eat Reeses peanut butter cups.
         * But not too many Reeses or they feel sick! A successful groundhog party will have between 10 and 20 Reeses peanut
         * butter cups, inclusive unless it is the weekend, in which case they will need 15 to 25 Reeses peanut butter cups,
         * inclusive.
         *
         * Write a Java program that reads two values:
         * the first is the number of Reeses peanut butter cups;
         * the second is a boolean representing whether it is the weekend.
         * The program must print the boolean value - the party is successful or not.
         *
         * Sample Input 1:
         * 5 true
         * Sample Output 1:
         * false
         * Sample Input 2:
         * 16 false
         * Sample Output 2:
         * true
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        boolean flag = scanner.nextBoolean();

        if ((!flag && num1>=10 && num1<=20) || (flag && num1>=15 && num1<=25)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }

    public static void isBetween() {
        // Is between
        /**
         * Write a program that reads three integer numbers and prints true if the first number is between the second
         * and the third one (inclusive). Otherwise, it must print false.
         *
         * The sorting order of two last arguments can be any.
         * Sample Input 1:
         * 3 3 3
         * Sample Output 1:
         * true
         * Sample Input 2:
         * 40 30 50
         * Sample Output 2:
         * true
         * Sample Input 3:
         * 40 100 20
         * Sample Output 3:
         * true
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1<=num2 && num1>=num3 || num1<=num3 && num1>=num2){
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }

    public static void checkTheSum() {
        //   Check the sum
        /**
         * Write a program that reads the numbers a, b, c and checks if any pair of them sums to 20.
         * The program must output true or false.
         *
         * Sample Input 1:
         * 1 2 3
         * Sample Output 1:
         * false
         * Sample Input 2:
         * 4 16 7
         * Sample Output 2:
         * true
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum1 = num1+num2;
        int sum2 = num2+num3;
        int sum3 = num1+num3;

        if (sum1==20 || sum2==20 || sum3 ==20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void checkTheGivenNumberAreDifferent() {
        //    Check the given numbers are different
        /**
         * Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.
         * The output should be true or false.
         *
         * Sample Input 1:
         * 5 5 9
         * Sample Output 1:
         * false
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }

    public static void exactlyOneParameterIsPositive() {
        //    Exactly one parameter is positive
        /**
         * Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).
         * Otherwise, it should print false.
         *
         * Sample Input 1:
         * 1 1 1
         * Sample Output 1:
         * false
         * Sample Input 2:
         * 1 0 -1
         * Sample Output 2:
         * true
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int[] array = new int[3];
        array[0] = n1;
        array[1] = n2;
        array[2] = n3;

        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (array[i] > 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // OR

        boolean onlyFirstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean onlySecondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean onlyThirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;

        boolean exactlyOneIsPositive =
                onlyFirstIsPositive ||
                        onlySecondIsPositive ||
                        onlyThirdIsPositive;

        System.out.println(exactlyOneIsPositive);
    }

    public static void boysInASportClass() {
        //   Boys in a sport class
        /**
         * Suppose there are three boys in a sports class.
         *
         * You need to write a program that checks the boys are arranged in the ascending or descending order by height.
         * The program must read three integer numbers h1, h2, h3 and outputs true or false. If boys have the same height,
         * they are considered as correctly arranged.
         * Sample Input 1:
         * 165 161 158
         * Sample Output 1:
         * true
         * Sample Input 2:
         * 155 165 160
         * Sample Output 2:
         * false
         * Sample Input 3:
         * 161 161 165
         * Sample Output 3:
         * true
         */
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        if (h1 <= h2 && h2 <= h3 || h3 <= h2 && h2 <= h1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
