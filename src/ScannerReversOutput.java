import java.util.*;

public class ScannerReversOutput {

    /**
     * Write a program that reads two integer numbers from the standard input and outputs them in the reverse order separated by one space.
     *
     * Sample Input 1:
     * 1 2
     * Sample Output 1:
     * 2 1
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int[] arr = new int[3];
        arr[0] = c;
        arr[1] = d;
        arr[2] = e;

        for(int i = arr.length-1; i>=0; i--){
            int c1 = arr[i];

            //System.out.println(c1);
            System.out.print(c1+" ");
        }

    }
}
