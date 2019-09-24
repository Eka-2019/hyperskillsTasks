import java.util.Scanner;

public class SwitchExercises {



    public static void main4(String[] args) {
        //    From string to a number
        /**
         * Write a program that read a string from the standard input and outputs the number.
         * A number can be from 1 to 9 (inclusive).
         * Sample Input 1:
         * one
         * Sample Output 1:
         * 1
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        switch (a){
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
            case "six":
                System.out.println("6");
                break;
            case "seven":
                System.out.println("7");
                break;
            case "eight":
                System.out.println("8");
                break;
            case "nine":
                System.out.println("9");
                break;
            default:
                break;
        }
    }

    public static void main3(String[] args) {
        //    Floor-space of the room
        /**
         * Residents of the country of Malevia often experiment with the plan of their rooms.
         * Rooms can be triangular, rectangular, and round. To quickly calculate the floorage it is required
         * to write a program that gets the type of the room shape and the relevant parameters as input. The
         * program should output the area of the resulting room.
         * The value of 3.14 is used instead of the number π in Malevia.
         * Input format used by the Malevians:
         *
         * triangle
         * a
         * b
         * c
         *
         * where a, b and c — lengths of the triangle sides.
         *
         * rectangle
         * a
         * b
         *
         *
         * where a and b — lengths of the rectangle sides.
         *
         * circle
         * r
         *
         * where r — circle radius.
         *
         * Note, the input values (a, b, c, r) are doubles and your answer should be, too.
         *
         * Sample Input 1:
         * rectangle
         * 4
         * 10
         * Sample Output 1:
         * 40.0
         * Sample Input 2:
         * circle
         * 5
         * Sample Output 2:
         * 78.5
         * Sample Input 3:
         * triangle
         * 3
         * 4
         * 5
         * Sample Output 3:
         * 6.0
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        String room = scan.nextLine();
        double square = 0;

        switch (room) {
            case "triangle":
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                double c = scan.nextDouble();
                double p = (a+b+c)/2;
                square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println(square);
                break;
            case "rectangle":
                double a1 = scan.nextDouble();
                double b1 = scan.nextDouble();
                square = a1*b1;
                System.out.println(square);
                break;
            case "circle":
                double r = scan.nextDouble();
                square = 3.14*r*r;
                System.out.println(square);
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }

    public static void main2(String[] args) {
        //    A simple calculator
        /**
         * A simple calculator
         *
         * Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.
         *
         * The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen. Note that the numbers are long.
         *
         * The calculator should support:
         *
         * addition: "+"
         * subtraction: "-"
         * integer division: "/"
         * multiplication: "*"
         * If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".
         *
         * If the input operator is not one from the list, the program should output "Unknown operator".
         *
         * Note: it's recommended to use the switch statement in your solution.
         *
         * Sample Input 1:
         * 10000000000 + 20000000000
         * Sample Output 1:
         * 30000000000
         * Sample Input 2:
         * 3000 / 0
         * Sample Output 2:
         * Division by 0!
         * Sample Input 3:
         * 10000 ! 300
         * Sample Output 3:
         * Unknown operator
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        long a = Long.parseLong(line[0]);
        String b = line[1];
        long c = Long.parseLong(line[2]);
        long result = 0;

        switch (b) {
            case "+":
                result = a + c;
                System.out.println(result);
                break;
            case "-":
                result = a - c;
                System.out.println(result);
                break;
            case "/":
                if (c == 0) {
                    System.out.println("Division by 0!");
                } else {
                    result = a / c;
                    System.out.println(result);
                }
                break;
            case "*":
                result = a * c;
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }

    public static void main1(String[] args) {
        //   Shape
        /**
         * Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus) and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number). If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".
         *
         * Note: output text should exactly match the sample, including letters' case and location of spaces.
         *
         * Sample Input 1:
         * 1
         * Sample Output 1:
         * You have chosen a square
         */

        // put your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }

    }
}
