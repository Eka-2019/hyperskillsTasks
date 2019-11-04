import java.util.Scanner;

public class ForLoopExercises {

    public static void main(String[] args) {
        theRootOfAnEquation();
        luckyNumber();
        arithmeticAverage();
        theProductOfNumberFromAToB();
        sumOfNumberDivisibleBy6();
        theCountOfNumbersDivisibleByN();
        theSumOfIntegersFromAToB();
        grades();
        maximunElementDivisibleBy4();
        sizeOfParts();
        fizzBuzz();

    }

    public static void theRootOfAnEquation() {
        //   The roots of an equation
        /**
         * The roots of a cubic equation
         * Given the numbers: a,b,c,d. Output in ascending order all the integers between 0 and 1000 which
         * are the roots of the equation
         * ax^3+bx^2+cx+d=0.
         * If the specified interval does not contain the roots of the equation, do not output anything.
         *
         * Sample Input 1:
         * -1
         * 1
         * -1
         * 1
         * Sample Output 1:
         * 1
         * Sample Input 2:
         * 0
         * 1
         * -6
         * 5
         * Sample Output 2:
         * 1
         * 5
         * Sample Input 3:
         * 1
         * 1
         * 1
         * 1
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        for(int i=0; i<1000; i++){
            if(a*Math.pow(i,3)+b*Math.pow(i,2)+c*i +d==0){
                System.out.println(i);
            }

        }

        // reference solution
        for(int i=0; i<1000; i++){
            if(a*Math.pow(i,3)+b*Math.pow(i,2)+c*i +d==0){
                System.out.println(i);
            }

        }

    }

    public static void luckyNumber() {
        //    Lucky number
        /**
         * Given the number N with an even number of digits. If the sum of the first half of the digits equals the sum of
         * the second half of the digits, then this number is considered lucky. For a given number, output "YES" if this
         * number is lucky, otherwise output "NO".
         * Sample Input 1:
         * 12344321
         * Sample Output 1:
         * YES
         * Sample Input 2:
         * 125322
         * Sample Output 2:
         * NO
         */

        Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().split("");
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a.length/2; i++) {
            sum1 = sum1 + Integer.valueOf(a[i]);
        }
        for (int i = a.length/2; i < a.length; i++) {
            sum2 = sum2 + Integer.valueOf(a[i]);
        }
        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void arithmeticAverage() {
        //   Arithmetic average
        /**
         * Write a program that reads two numbers a and b from the keyboard and calculates and outputs to the console the arithmetic average
         * of all numbers from the interval [a;b], which are divisible by 3.
         * In the example below, the arithmetic average is calculated for the numbers on the interval
         * [−5;12]. Total numbers divisible by 3 on this interval
         * −3,0,3,6,9,12. Their arithmetic average equals to 4.5
         * The program input contains intervals, which always contain at least one number, which is divisible by 3.
         *
         * Sample Input 1:
         * -5
         * 12
         * Sample Output 1:
         * 4.5
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                count = count + 1;
            }

        }

        float average = (float) sum / count;
        System.out.println(average);
    }

    public static void theProductOfNumberFromAToB() {
        //  The product of numbers from a to b
        /**
         * Write a program that prints the product of all integer numbers from a to b (a < b).
         * Include a and exclude b from the product.
         *
         * Sample Input 1:
         * 1 2
         * Sample Output 1:
         * 1
         * Sample Input 2:
         * 100 105
         * Sample Output 2:
         * 11035502400
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        long prod = 1;

        for (int i = a; i < b; i++) {
            prod = prod * i;
        }
        System.out.println(prod);

    }

    public static void sumOfNumberDivisibleBy6() {
        //   Sum of numbers divisible by 6
        /**
         * Given the sequence of natural numbers. Find the sum of numbers divisible by 6.
         * The input is the number of elements in the sequence, and then the elements themselves.
         * In this sequence, there is always a number divisible by 6.
         *
         * Sample Input 1:
         * 8
         * 11
         * 12
         * 68
         * 6
         * 98
         * 81
         * 36
         * 86
         * Sample Output 1:
         * 54
         */

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int a = scan.nextInt();

            if (a % 6 == 0) {
                sum = sum + a;
            }

        }
        System.out.println(sum);

    }

    public static void theCountOfNumbersDivisibleByN() {
        //   The count of numbers divisible by N
        /**
         * Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.
         *
         * Note:  it is possible to write this program more efficiently without any loops.
         *
         * Sample Input 1:
         * 10 20 10
         * Sample Output 1:
         * 2
         * Sample Input 2:
         * 15 25 5
         * Sample Output 2:
         * 3
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    public static void theSumOfIntegersFromAToB() {
        //    The sum of integers from a to b
        /**
         *Print the sum of all integers from a to b including both.
         * It is guaranteed that a < b in all test cases.
         * Sample Input 1:
         * 3
         * 22
         * Sample Output 1:
         * 250
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            count = count + i;

        }
        System.out.println(count);


    }

    public static void grades() {
        //    Grades
        /**
         * Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in a class consisting of n students.
         * The program gets number n as input, and then gets the grades themselves (one by one). The program should output four
         * numbers in a single line - the number of "D", the number of "C", the number of "B" and the number of "A" grades.
         *
         * Sample Input 1:
         * 13
         * 2
         * 5
         * 5
         * 5
         * 5
         * 3
         * 2
         * 4
         * 3
         * 3
         * 3
         * 2
         * 3
         * Sample Output 1:
         * 3 5 1 4
         */

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int as = 0;
        int bs = 0;
        int cs = 0;
        int ds = 0;

        for (int i = 0; i < num; i++) {
            int a = scan.nextInt();
            if (a == 5) {
                as = as + 1;
            }
            if (a == 4) {
                bs = bs + 1;
            }
            if (a == 3) {
                cs = cs + 1;
            }
            if (a == 2) {
                ds = ds + 1;
            }

        }
        System.out.println(ds + " " + cs + " " + bs + " " + as);
    }

    public static void maximunElementDivisibleBy4() {
        //   Maximum element divisible by 4
        /**
         * Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
         * The program receives the number of elements in the sequence and then the elements themselves as input.
         * In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
         * The program should print a single number: the maximum element of the sequence divisible by 4.
         *
         * Sample Input 1:
         * 12
         * 16
         * 87
         * 58
         * 25
         * 73
         * 86
         * 36
         * 79
         * 40
         * 12
         * 89
         * 32
         * Sample Output 1:
         * 40
         */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int max = 0;

        for (int i = 0; i < num; i++) {
            int a = scan.nextInt();

            if (a % 4 == 0 && max < a) {
                max = a;
            }

        }
        System.out.println(max);
    }

    public static void sizeOfParts() {
        //    Size of parts
        /**
         * A detector compares the size of parts produced by a machine with the reference standard.
         *
         * If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
         * If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
         * If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
         *
         * Write a program, which takes the number of parts n as input, and then the sequence of detector prints. The program should output numbers in a single line containing the number of parts ready to be shipped, the number of parts to be fixed, and the number of rejects.
         *
         * Sample Input 1:
         * 14
         * 0
         * -1
         * -1
         * 1
         * 0
         * 0
         * 0
         * 0
         * 0
         * 1
         * 0
         * -1
         * 1
         * -1
         */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int norm = 0;
        int larger = 0;
        int smaller = 0;

        for (int i = 0; i < num; i++) {
            int count = scan.nextInt();
            if (count == 0) {
                norm = norm + 1;
            }
            if (count == 1) {
                larger = larger + 1;
            }
            if (count == -1) {
                smaller = smaller + 1;
            }
        }

        System.out.println(norm + " " + larger + " " + smaller);
    }

    public static void fizzBuzz() {
        //    Fizz Buzz
        /**
         * Fizz Buzz is a classic programming problem. Here is its slightly modified version.
         * Write a program that takes the input of two integers: the beginning and the end of the interval (both numbers belong to the interval).
         * The program should output the numbers from this interval, but if the number is divisible by 3, you should output Fizz instead of it;
         * if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.
         * Output each number or the word on a separate line.
         *
         * Sample Input 1:
         * 8 16
         * Sample Output 1:
         * 8
         * Fizz
         * Buzz
         * 11
         * Fizz
         * 13
         * 14
         * FizzBuzz
         * 16
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }


    }
}
