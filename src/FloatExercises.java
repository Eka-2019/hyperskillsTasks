import java.util.Scanner;


public class FloatExercises {



    public static void main(String[] args) {

        //   Liquid pressure
        /**
         * Problem
         * Write a program that reads the density of a liquid and the height of a column, and calculates the liquid pressure.
         * We suppose the gravity is 9.8 m/s² (Earth). Do not format the result.
         *
         * Some explanations
         * When a person swims under the water, water pressure is felt acting on the person's eardrums. The deeper that person swims,
         * the greater the pressure. The pressure felt is due to the weight of the water above the person. As someone swims deeper,
         * there is more water above the person and therefore greater pressure. The pressure a liquid exerts depends on its depth.
         * Liquid pressure also depends on the density of the liquid. If someone was submerged in a liquid more dense than water,
         * the pressure would be correspondingly greater. Thus we can say that the depth, density and liquid pressure are directly
         * proportionate. The pressure due to a liquid in liquid columns of constant density or at a depth within a substance is
         * represented by the following formula:
         * p=pgh
         *
         * where:
         * p is liquid pressure,
         * g is gravity at the surface of overlaying material,
         * ρ is density of liquid,
         * h is height of liquid column.
         *
         * Sample Input 1:
         * 1.7 5.5
         * Sample Output 1:
         * 91.63
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        double result = density*9.8*height;
        System.out.println(result);

    }


    public static void main5(String[] args) {
        //   Evaluate an expressions- 1
        /**
         * Write a program which reads a double value x and evaluates the result of
         * x3+x2+x+1
         *
         * Output data format
         * The double result of the expression.
         *
         * Sample Input 1:
         * 22.5
         * Sample Output 1:
         * 11920.375
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        double numX = scanner.nextDouble();
        double result = Math.pow(numX,3)+Math.pow(numX,2)+numX+1;
        System.out.println(result);


        //Evaluate an expression - 2
        /**
         * Write a program that reads four double values a, b, c, d and then evaluates the following expression
         * a * 10.5 + b * 4.4 + (c + d) / 2.2
         * The program should output the result.
         *
         * Sample Input 1:
         * 1
         * 2.5
         * 0
         * 4.4
         * Sample Output 1:
         * 23.5
         */

        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();
        double numC = scanner.nextDouble();
        double numD = scanner.nextDouble();

        double res = numA*10.5+numB*4.4+(numC+numD)/2.2;
        System.out.println(res);

    }

    public static void main4(String[] args) {
        //     Celsius to Fahrenheit

        /**
         * Write a program that reads a temperature in Celsius (°C) and shows its equivalent in Fahrenheit temperature (°F).
         * Use the following formula:
         * F = C * 1.8 + 32
         * Where C is a temperature in Celsius, F - is a temperature in Fahrenheit.
         *
         * Sample Input 1:
         * 32.9
         * Sample Output 1:
         * 91.22
         * Sample Input 2:
         * 0
         * Sample Output 2:
         * 32.0
         */
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double numC = scanner.nextDouble();
        double numF = numC*1.8+32;
        System.out.println(numF);

    }


    public static void main3(String[] args) {
        //   Difference between two doubles
        /**
         * Write a program that read two double values and prints the difference between the second and the first one.
         * Sample Input 1:
         * 18.4
         * -5.0
         * Sample Output 1:
         * -23.4
         */
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();

        System.out.println(numB - numA);

    }

    public static void main2(String[] args) {
        //    Area of a circle
        /**
         * Given the radius ﻿of the circle, you need to find an area of that circle. Use this formula:
         * S=πR2
         * Where
         * S - an area of a circle,
         * π - Math.PI constant,
         * R - radius of the circle.
         *
         * Sample Input 1:
         * 100
         * Sample Output 1:
         * 31415.926535897932
         */
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double radius = scanner.nextDouble();

        System.out.println(Math.PI * Math.pow(radius, 2));
    }

    public static void main1(String[] args) {
        //   Find X
        /**
         * Write a program that reads three double values a, b, c, and then solving the simplest equation:
         *
         * a * x + b = c
         * The program should output the value of x.
         *
         * It's guaranteed, a is not 0.
         *
         * Sample Input 1:
         * 2 -1 2
         * Sample Output 1:
         * 1.5
         */

        Scanner scanner = new Scanner(System.in);
        // put your code here
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println((c - b) / a);
    }

}
