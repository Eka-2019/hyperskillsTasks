import java.util.*;


public class MathExercises {



    public static void main1(String[] args) {
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

    public static void main0(String[] args) {
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


    public static void main_(String[] args) {
        //ceil/floor usage

        System.out.println(Math.ceil(1.45));
        System.out.println(Math.floor(1.55));
    }

}

