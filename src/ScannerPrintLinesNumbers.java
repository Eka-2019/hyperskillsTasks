import java.util.Scanner;

public class ScannerPrintLinesNumbers {

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
     * @param args
     */

    public static void main(String[] args) {
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
