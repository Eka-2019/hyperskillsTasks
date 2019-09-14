import java.util.Random;
import java.util.Scanner;

public class RandomExercises {




    public static void main(String[] args) {
        //   Find the seed

        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        Random random = new Random(from+to);
        int result1 = 0;



        for (int i = 0; i < numN; i++) {
            int result = (random.nextInt((to+1) - from) + from);
            result1 =result1+result;
        }
        System.out.println(result1);
    }





    //  Generate random numbers

    /**
     * Given the number N, and the numbers A and B, output sum of the first N random numbers in a range from A to B inclusively.
     * The seed should be a number A+B.
     *
     * Input contains numbers N, A, B in a single line in this order.
     * Sample Input 1:
     * 100 5 10
     * Sample Output 1:
     * 734
     * @param args
     */

    public static void main1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        Random random = new Random(from+to);
        int result1 = 0;

        for (int i = 0; i < numN; i++) {
            int result = (random.nextInt((to+1) - from) + from);
            result1 =result1+result;
        }
        System.out.println(result1);
    }

}
