
import java.util.Scanner;

public class ScanningInputExercises {


    public static void main(String[] args) {

        //    Reversing input numbers
        /**
         * Write a program that reads two integer numbers from the standard input and outputs them in the reverse order separated by one space.
         *
         * Sample Input 1:
         * 1 2
         * Sample Output 1:
         * 2 1
         */

        // put your code here
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[2];
        arr[0] = c;
        arr[1] = d;

        for(int i = arr.length-1; i>=0; i--){
            int c1 = arr[i];

            System.out.print(c1+" ");
        }
    }

    public static void main1(String[] args) {
        //   Printing each word in a new line
        /**
         * Write a program that reads five words from the standard input and outputs each word in a new line.
         *
         * First, you need to print all the words from the first line, then from the second (from the left to right).
         * Sample Input 1:
         * This Java course
         * is adaptive
         * Sample Output 1:
         * This
         * Java
         * course
         * is
         * adaptive
         */

        // put your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        String e = sc.next();

        String[] arr = new String[5];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        for (String element : arr) {
            System.out.println(element);
        }

    }

    public static void main0(String[] args) {
        //   Print strings
        /**
         * Write a program that reads two lines and two numbers (in one line) and outputs them in the same order, each in a new line.
         * Sample Input 1:
         * Hello
         * Java
         * 500 600
         * Sample Output 1:
         * Hello
         * Java
         * 500
         * 600
         */

        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[2];
        arr[0] = c;
        arr[1] = d;

        for (String element : line1) {
            System.out.println(element);
        }
        for (String element : line2) {
            System.out.println(element);
        }
        for (int element : arr) {
            System.out.println(element);
        }

    }

}
