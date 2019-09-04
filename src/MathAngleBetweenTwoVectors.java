import java.util.*;

/**
 * Given two 2D vectors. Find the angle (degree) between them.
 *
 * If you don't know how to find the angle, see here: http://www.wikihow.com/Find-the-Angle-Between-Two-Vectors.
 *
 * Input data format
 *
 * The first line contains two components of the first vector, the second line contains two components of the second vector. Components in one line is separated by space.
 *
 * Output data format
 *
 * One double value - an angle between two vectors. The result can have an error less than 1e-8.
 *
 * Sample Input 1:
 * 1 3
 * 4 2
 * Sample Output 1:
 * 45
 * Sample Input 2:
 * 0 4
 * 0 4
 * Sample Output 2:
 * 0
 */

public class MathAngleBetweenTwoVectors {

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        double fv1 = sc.nextDouble();
        double lv1 = sc.nextDouble();
        double fv2 = sc.nextDouble();
        double lv2 = sc.nextDouble();

        double lengthV1 = Math.sqrt(Math.pow(fv1,2) + Math.pow(lv1,2));
        double lengthV2 = Math.sqrt(Math.pow(fv2,2) + Math.pow(lv2,2));
        double dotProd = fv1*fv2+lv1*lv2;
        double cos = dotProd/(lengthV1*lengthV2);

        System.out.println(Math.toDegrees(Math.acos(cos)));

    }
}
