
import java.util.Scanner;


public class ScannerPrintWords {

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
     * @param args
     */

    public static void main(String[] args) {
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
}