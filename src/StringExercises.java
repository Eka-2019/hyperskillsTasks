import java.util.Locale;
import java.util.Scanner;

public class StringExercises {

    public static void main(String[] args) {
        comparingStringsIgnoringWhitespace();
        replacingAWithB();
        checkBurgsInCityName();
        checkPrefixIgnoringTheCase();
        extractingASubstring();
    }


    public static void comparingStringsIgnoringWhitespace() {
        //   Comparing strings ignoring whitespaces
        /**
         * Write a program that reads two strings and compares them without whitespaces. The program should prints true if both strings are equal, otherwise - false.
         * Sample Input 1:
         *   string
         * str ing
         * Sample Output 1:
         * true
         * Sample Input 2:
         * string
         * my string
         * Sample Output 2:
         * false
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = str1.trim().replaceAll("\\s", "");
        str2 = str2.trim().replaceAll("\\s", "");

        if (str1.equalsIgnoreCase(str2)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

    }

    public static void replacingAWithB() {
        //    Replacing 'a' with 'b'
        /**
         * Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
         * The program should output the resulting string.
         *
         * Sample Input 1:
         * aaa
         * Sample Output 1:
         * bbb
         * Sample Input 2:
         * bca
         * Sample Output 2:
         * bcb
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace("a", "b");
        System.out.println(str);
    }

    public static void checkBurgsInCityName() {
        //    Check burgs
        /**
         * Write a program that reads the name of a city and check the name ends with "burg".
         * Keep in mind, a city can have a short name.
         * The program should output true or false.
         *
         * Sample Input 1:
         * Brandenburg
         * Sample Output 1:
         * true
         * Sample Input 2:
         * Saint Petersburg
         * Sample Output 2:
         * true
         * Sample Input 3:
         * Tu
         * Sample Output 3:
         * false
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        if (cityName.endsWith("burg")) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    public static void checkPrefixIgnoringTheCase() {
        //   Check prefix ignoring the case
        /**
         * Write a program that checks a given string starts with the prefix "J" ignoring the case.
         *
         * The program should output true or false.
         *
         * Sample Input 1:
         * Java
         * Sample Output 1:
         * true
         * Sample Input 2:
         * Kotlin
         * Sample Output 2:
         * false
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase(Locale.ENGLISH);
        if(str.startsWith("j")) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void extractingASubstring() {
        //   Extracting a substring
        /**
         * Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both.
         * Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.
         *
         * Sample Input 1:
         * Java
         * 0 2
         * Sample Output 1:
         * Jav
         */
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        String sub = str.substring(num1, num2+1);
        System.out.println(sub);

    }


}
