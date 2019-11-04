import java.util.*;


public class MathExercises {

    public static void main(String[] args) {
        angleBetweenTwoVectors();
        equation();
        heronsFormula();
    }

    public static void angleBetweenTwoVectors() {
        /**
         * Given two 2D vectors. Find the angle (degree) between them.
         * If you don't know how to find the angle, see here: http://www.wikihow.com/Find-the-Angle-Between-Two-Vectors.
         * Input data format
         * The first line contains two components of the first vector, the second line contains two components of the second vector.
         * Components in one line is separated by space.
         * Output data format
         * One double value - an angle between two vectors. The result can have an error less than 1e-8.
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

    public static void equation() {
        // Equation
        /**
         * Given real numbers a, b, c, where a ≠ 0.
         *
         * Solve the quadratic equation
         * ax^2+bx+c=0 and output all of its roots.
         *
         * It is guaranteed that the equation always has two roots.
         *
         * Output the results roots in ascending order. Do not round/format them, the testing system does it automatically.
         * Sample Input 1:
         * 1
         * -1
         * -2
         * Sample Output 1:
         * -1 2
         * Sample Input 2:
         * 1
         * -7.5
         * 3
         * Sample Output 2:
         * 0.423966 7.07603
         * Sample Input 3:
         * 0.1
         * -2
         * 0.999
         * Sample Output 3:
         * 0.51264 19.4874
         * Sample Input 4:
         * -11
         * -32
         * 41
         * Sample Output 4:
         * -3.87177 0.962679
         * @param args
         */
        // put your code here
        double x1 = 0;
        double x2 = 0;
        double[] arr = new double[2];

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a==0){
            System.out.print("a should not be equal zero");
            sc.nextDouble();
        }
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = Math.pow(b,2)-4.0*a*c;


        if(d>0) {
            x1 = (-b+Math.sqrt(d))/(2.0*a);
            x2 = (-b-Math.sqrt(d))/(2.0*a);

        }
        if (d<0){
            x1 = 0;
            x2 = 0;
        }

        if (d==0) {
            x1 = -b/2.0*a;
            x2 = 0;
        }


        arr[0] = x1;
        arr[1] = x2;

        Arrays.sort(arr);

        for (double num: arr){
            System.out.print(num+" ");
        }
    }

    public static void heronsFormula() {
        //   Herons formula

        /**
         * Many years ago when Paul went to school, he did not like the Heron's formula to calculate the area of a triangle, because he considered it very complex. Once he decided to help all school students: to write and distribute the program, calculating the area of a triangle by its three sides.
         *
         * However, there was a problem: as Paul did not like the formula, he did not memorize it. Help him finish this act of kindness and write the program, calculating the area of a triangle by the transferred length of its sides, in accordance with the Heron's formula:
         *
         * S= sqrt(p(p−a)(p−b)(p−c))
         * where p=(a+b+c)/2
         *   – half-perimeter of the triangle. On the input, the program has integers, and the output should be a real number corresponding to the area of the triangle.
         * Sample Input 1:
         * 3
         * 4
         * 5
         * Sample Output 1:
         * 6.0
         * @param args
         */

        // put your code here
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double p = (a + b + c) / 2.0;
        double sq = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.print(sq);
    }


    public static void ceilFloorUsage() {
        //ceil/floor usage

        System.out.println(Math.ceil(1.45));
        System.out.println(Math.floor(1.55));
    }

}

