import java.util.Random;
import java.util.Scanner;

public class RandomExercises {

    public static void main(String[] args) {
        generateRandomNumber();

    }

    //TO BE DONE
    public static void gaussianRandomNumbers() {
        //Gaussian random numbers
        int n = 17;

        int result = n >> 3;
        double result1= Math.floorMod(17,3);


        System.out.println(result);

        System.out.println(result1);

    }

    //TO BE DONE
    public static void findTheSeed() {
        //   Find the seed
        /**
         * Find the seed between A and B (both inclusively) that produces N pseudorandom numbers from 0 (inclusive) to K
         * (exclusive) and have the maximum of these N numbers be the minimum among all maximums of other seeds in this range.
         *
         * For example, we have A=7, B=9, N=4, K=100. Suppose:
         *
         * For the seed 7, we get sequence 45, 99, 23, 67 – the maximum is 99.
         * For the seed 8, we get 64, 34, 23, 9 – the maximum is 64.
         * For the seed 9, we get 78, 34, 0, 11 – the maximum is 78.
         * Then the minimum among these maximums is 64 for the seed 8, therefore, in this example, the program should output 8.
         *
         * The input contains numbers A, B, N, K in a single line.
         *
         * You should output 2 numbers: a seed and it's maximum. If there are some seeds with equal minimal maximums,
         * you should output the seed which is less than all other seeds.
         *
         * Sample Input 1:
         * 0 100 5 1000
         * Sample Output 1:
         * 18
         * 270
         * Sample Input 2:
         * 0 100 1000 1000
         * Sample Output 2:
         * 5
         * 993
         * Sample Input 3:
         * 0 100 10000 1000
         * Sample Output 3:
         * 0
         * 999
         */

        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        Random random = new Random(from + to);
        int result1 = 0;


        for (int i = 0; i < numN; i++) {
            int result = (random.nextInt((to + 1) - from) + from);
            result1 = result1 + result;
        }
        System.out.println(result1);
    }

    public static void generateRandomNumber() {
        //  Generate random numbers

        /**
         * Given the number N, and the numbers A and B, output sum of the first N random numbers in a range from A to B inclusively.
         * The seed should be a number A+B.
         * <p>
         * Input contains numbers N, A, B in a single line in this order.
         * Sample Input 1:
         * 100 5 10
         * Sample Output 1:
         * 734
         *
         * @param args
         */

        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        Random random = new Random(from + to);
        int result1 = 0;

        for (int i = 0; i < numN; i++) {
            int result = (random.nextInt((to + 1) - from) + from);
            result1 = result1 + result;
        }
        System.out.println(result1);
    }

    public static void floorModExample() {
        int n = 17;

        int result = n >> 3;
        double result1= Math.floorMod(17,3);


        System.out.println(result);

        System.out.println(result1);

    }

}
