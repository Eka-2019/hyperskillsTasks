import java.util.Arrays;
import java.util.Scanner;

public class ConditionalStatementExercises {

    public static void main(String[] args) {
        chocolate();
        queens();
        simpleEquation();
        symmetricalNumber();
        boxes();
        leapYear();
        triangle();
        interval();

    }

    public static void chocolate() {
        //   Chocolate
        /**
         * A chocolate bar has the shape of a rectangle, divided into NxM segments.
         * You can break down this chocolate bar into two parts by a single straight line (only once).
         * Find whether you can break off exactly K segments from the chocolate. Each segment is 1x1.
         *
         * Input data format
         * The program gets an input of three integers: N, M, K
         * Output data format
         * The program must output one of the two words: YES or NO.
         * Sample Input 1:
         * 4
         * 2
         * 6
         * Sample Output 1:
         * YES
         * Sample Input 2:
         * 2
         * 10
         * 7
         * Sample Output 2:
         * NO
         * Sample Input 3:
         * 7
         * 4
         * 21
         * Sample Output 3:
         * YES
         */
        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((c%b==0 || c%a==0) && a*b >=c){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static void queens() {
        //   Queens
        /**
         * You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
         *
         * Input data format
         * Four integer numbers: x1, y1, x2, y2
         *
         * Output data format
         * Type "YES" (uppercase) if they hit each other or "NO" if they don't.
         * Sample Input 1:
         * 1 1 3 3
         * Sample Output 1:
         * YES
         * Sample Input 2:
         * 1 1 4 3
         * Sample Output 2:
         * NO
         * Sample Input 3:
         * 2 2 5 2
         * Sample Output 3:
         * YES
         */
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x10 = scan.nextInt();
        int y10 = scan.nextInt();
        double indX = Math.abs(x10-x1);
        double indY = Math.abs(y10-y1);

        if (x1 == x10 || y1 == y10 || indX==indY) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static void simpleEquation() {
        //    Solve a simple equation
        /**
         * Given a simple equation, you should output the correct value for variable "x".
         * The equation has two numbers greater than 0 and variable "x", and between these can be "+", "-" or "=".
         * Numbers, variable "x", symbols "+", "-", "=" all separated by a space.
         *
         * It is guaranteed that the equation is correct. The result should be an integer.
         * Sample Input 1:
         * 5 + x = 15
         * Sample Output 1:
         * 10
         * Sample Input 2:
         * x - 8 = 10
         * Sample Output 2:
         * 18
         * Sample Input 3:
         * 10 = 12 + x
         * Sample Output 3:
         * -2
         */
        Scanner scanner = new Scanner(System.in);
        String[] equ = scanner.nextLine().split(" ");
        int result = 0;

        if (equ[4].equals("x") && equ[1].equals("+")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int2 = Integer.valueOf(equ[2]);
            result = int1 + int2;
        } else if (equ[2].equals("x") && equ[1].equals("+")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int3 - int1;
        } else if (equ[0].equals("x") && equ[1].equals("+")) {
            Integer int2 = Integer.valueOf(equ[2]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int3 - int2;
        } else if (equ[4].equals("x") && equ[1].equals("-")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int2 = Integer.valueOf(equ[2]);
            result = int1 - int2;
        } else if (equ[2].equals("x") && equ[1].equals("-")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int1 - int3;
        } else if (equ[0].equals("x") && equ[1].equals("-")) {
            Integer int2 = Integer.valueOf(equ[2]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int3 + int2;
        } else if (equ[4].equals("x") && equ[3].equals("+")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int2 = Integer.valueOf(equ[2]);
            result = int1 - int2;
        } else if (equ[2].equals("x") && equ[3].equals("+")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int1 - int3;
        } else if (equ[0].equals("x") && equ[3].equals("+")) {
            Integer int2 = Integer.valueOf(equ[2]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int2 + int3;
        } else if (equ[4].equals("x") && equ[3].equals("-")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int2 = Integer.valueOf(equ[2]);
            result = int2 - int1;
        } else if (equ[2].equals("x") && equ[3].equals("-")) {
            Integer int1 = Integer.valueOf(equ[0]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int1 + int3;
        } else if (equ[0].equals("x") && equ[3].equals("-")) {
            Integer int2 = Integer.valueOf(equ[2]);
            Integer int3 = Integer.valueOf(equ[4]);
            result = int2 - int3;
        }

        System.out.println(result);

    }

    public static void symmetricalNumber() {
        //   Symmetrical number
        /**
         * Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetric, output 1; otherwise output any other integer. The number may have less than four digits; in this case you should assume that its decimal notation is complemented by insignificant zeros on the left.
         *
         * Sample Input 1:
         * 2002
         * Sample Output 1:
         * 1
         * Sample Input 2:
         * 2008
         * Sample Output 2:
         * 37
         */

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int a = num / 1000;
        int b = (num % 1000) / 100;
        int c = ((num % 1000) % 100) / 10;
        int d = ((num % 1000) % 100) % 10;

        if (a == d && b == c) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }


    }

    public static void boxes() {
        //   Boxes
        /**
         * There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2. You need to determine which box can be put inside another box. You can rotate both boxes as you want.
         *
         * Input contains two lines.
         * The first line contains numbers X1, Y1, Z1, the second line contains numbers X2, Y2, Z2. All numbers are integers and greater than 0.
         *
         * If the sizes of the boxes are equal, output "Box 1 = Box 2".
         * If the first box can be put inside the second box, output "Box 1 < Box 2".
         * If the second box can be put inside the first box, output "Box 1 > Box 2".
         * If none of the boxes can be put inside the other box, output "Incomparable".
         * Sample Input 1:
         * 1 1 1
         * 2 2 2
         * Sample Output 1:
         * Box 1 < Box 2
         * Sample Input 2:
         * 2 2 2
         * 1 2 2
         * Sample Output 2:
         * Box 1 > Box 2
         * Sample Input 3:
         * 1 2 3
         * 2 3 1
         * Sample Output 3:
         * Box 1 = Box 2
         * Sample Input 4:
         * 2 3 4
         * 1 3 5
         * Sample Output 4:
         * Incomparable
         */

        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[] set1 = scanner.nextLine().split(" ");
        String[] set2 = scanner.nextLine().split(" ");

        Integer a = Integer.valueOf(set1[0]);
        Integer b = Integer.valueOf(set1[1]);
        Integer c = Integer.valueOf(set1[2]);
        int[] set1New = {a, b, c};

        Integer x = Integer.valueOf(set2[0]);
        Integer y = Integer.valueOf(set2[1]);
        Integer z = Integer.valueOf(set2[2]);
        int[] set2New = {x, y, z};

        Arrays.sort(set1New);
        Arrays.sort(set2New);

        if (set1New[0] < set2New[0] && set1New[1] <= set2New[1] && set1New[2] <= set2New[2] || set1New[0] <= set2New[0] && set1New[1] <= set2New[1] && set1New[2] < set2New[2] || set1New[0] <= set2New[0] && set1New[1] < set2New[1] && set1New[2] <= set2New[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (set1New[0] > set2New[0] && set1New[1] >= set2New[1] && set1New[2] >= set2New[2] || set1New[0] >= set2New[0] && set1New[1] >= set2New[1] && set1New[2] > set2New[2] || set1New[0] >= set2New[0] && set1New[1] > set2New[1] && set1New[2] >= set2New[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (set1New[0] == set2New[0] && set1New[1] == set2New[1] && set1New[2] == set2New[2]) {
            System.out.println("Box 1 = Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }

    public static void leapYear() {
        //   Leap year
        /**
         * Find whether the given year is a leap year.
         *
         * Just a reminder: leap years are those years in which the year’s number is either divisible by 4, but not divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).
         *
         * The program should work correctly for the years 1900 ≤ n ≤ 3000.
         *
         * Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.
         *
         * It is enough to write a simple conditional statement to solve this task.
         *
         * Sample Input 1:
         * 2100
         * Sample Output 1:
         * Regular
         * Sample Input 2:
         * 2000
         * Sample Output 2:
         * Leap
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
            System.out.println("Leap");

        } else {
            System.out.println("Regular");
        }
    }

    public static void triangle() {
        //  Triangle
        /**
         * Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.
         *
         * If the triangle exists - output the YES string, otherwise - output NO.
         *
         * Note, a triangle is formed by three connected points that are not located on a single straight line.
         *
         * Sample Input 1:
         * 3
         * 4
         * 5
         * Sample Output 1:
         * YES
         */

        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();

        if (side1 < side3 && side2 < side3 && (side1 + side2) > side3) {
            System.out.println("YES");
        } else if (side1 < side2 && side3 < side2 && (side1 + side3) > side2) {
            System.out.println("YES");
        } else if (side2 < side1 && side3 < side1 && (side2 + side3) > side1) {
            System.out.println("YES");
        } else if (side1 == side2 && side1 == side3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        //correct one
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void interval() {
        //   Interval
        /**
         * Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).
         *
         * Here are two types of brackets in the intervals:
         *
         * parenthesis () exclude the border number;
         * and square brackets [] include the border number.
         * Sample Input 1:
         * 20
         * Sample Output 1:
         * True
         * Sample Input 2:
         * -20
         * Sample Output 2:
         * False
         */


        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > -15 && num <= 12 || num > 14 && num < 17 || num >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}


