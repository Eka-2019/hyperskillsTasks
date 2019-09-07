import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class LocalDateExercises {



    // Print The first and the last day of a month
    public static void main9(String[] args) {
/**
 * Write a program that reads a year and a month and outputs the first and the last day of the month.
 * Sample Input 1:
 * 2017
 * 1
 * Sample Output 1:
 * 2017-01-01 2017-01-31
 */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        int tmpYear = scanner.nextInt();
        int tmpMonth = scanner.nextInt();

        LocalDate date = LocalDate.of(tmpYear, tmpMonth,1);

        Month month = date.getMonth();
        int lenghtOfMonth = month.length(date.isLeapYear());

        LocalDate lastDayOfTheMonth = date.withDayOfMonth(lenghtOfMonth);

        System.out.println(date);
        System.out.println(lastDayOfTheMonth);

    }





    // The last day of a month
    public static void main8(String[] args) {
/**
 * Write a program that reads a year and the number of a day in this year, and checks the day is the last day of a month.
 * The program must output "true" or "false".
 * Sample Input 1:
 * 2017 31
 * Sample Output 1:
 * true
 */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split(" ");
        String tmpYear = date[0];
        Integer year = Integer.valueOf(tmpYear);
        String tmpDay = date[1];
        Integer day = Integer.valueOf(tmpDay);

        LocalDate dayInYear = LocalDate.ofYearDay(year, day);
        System.out.println("dayInYear: " + dayInYear);
        int dayOfMonth = dayInYear.getDayOfMonth();
        System.out.println("numer day in month: " + dayOfMonth);

        Month getMonth = dayInYear.getMonth();
        System.out.println("month: " + getMonth);
        int lastDayOfTheMonth = getMonth.length(dayInYear.isLeapYear());
        System.out.println("last day in month: " + lastDayOfTheMonth);

        if (dayOfMonth == lastDayOfTheMonth) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


    // The first day of a month
    public static void main7(String[] args) {
/**
 * Write a program that reads a year and the number of a day in this year, and checks the day is the first day of a month.
 * The program must output "true" or "false".
 * Sample Input 1:
 * 2017 31
 * Sample Output 1:
 * false
 */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split(" ");
        String tmpYear = date[0];
        Integer year = Integer.valueOf(tmpYear);
        String tmpDay = date[1];
        Integer day = Integer.valueOf(tmpDay);

        LocalDate dayInYear = LocalDate.ofYearDay(year, day);
        int dayOfMonth = dayInYear.getDayOfMonth();


        if (dayOfMonth == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    // Getting information of a day
    public static void main6(String[] args) {

        /**
         * Write a program that reads a date from the standard input and output the number of the day in the year and the number of the day in the month.
         * Sample Input 1:
         * 2017-06-03
         * Sample Output 1:
         * 154 3
         * Sample Input 2:
         * 2017-04-28
         * Sample Output 2:
         * 118 28
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        LocalDate parseDate = LocalDate.parse(date);

        int newDate = parseDate.getDayOfYear();
        int newDate1 = parseDate.getDayOfMonth();
        System.out.println(newDate + " " + newDate1);

    }


    // A date before and after 30 years
    public static void main5(String[] args) {
        /**
         * Write a program that reads a date from the standard input and prints two dates - before and after 30 years compares to the given date.
         * Sample Input 1:
         * 2017-06-03
         * Sample Output 1:
         * 1987-06-03
         * 2047-06-03
         * Sample Input 2:
         * 2017-04-28
         * Sample Output 2:
         * 1987-04-28
         * 2047-04-28
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        LocalDate parseDate = LocalDate.parse(date);

        LocalDate newDate = parseDate.minusYears(30);
        LocalDate newDate1 = parseDate.plusYears(30);
        System.out.println(newDate);
        System.out.println(newDate1);

    }


    // A date before 10 days
    public static void main4(String[] args) {
        /**
         * Write a program that reads a date from the standard input and prints a date before 10 days.
         * Sample Input 1:
         * 2017-06-03
         * Sample Output 1:
         * 2017-05-24
         * Sample Input 2:
         * 2017-04-28
         * Sample Output 2:
         * 2017-04-18
         */
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        LocalDate parseDate = LocalDate.parse(date);

        LocalDate newDate = parseDate.minusDays(10);
        System.out.println(newDate);

    }

    // LocalDateADateAfterTwoWeek
    public static void main3(String[] args) {
        /**
         * Write a program that reads a date from the standard input and prints a date after 2 weeks.
         * Sample Input 1:
         * 2017-06-03
         * Sample Output 1:
         * 2017-06-17
         * Sample Input 2:
         * 2017-04-28
         * Sample Output 2:
         * 2017-05-12
         *
         */
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        LocalDate parseDate = LocalDate.parse(date);

        LocalDate newDate = parseDate.plusDays(14);
        System.out.println(newDate);

    }

    // LocalDateAllMondaysInMonth
    public static void main2(String[] args) {
        /**
         * Write a program that reads a year and the number of a month (1-12)
         * and prints dates of all Mondays in this month from the first to the last date.
         * @param args
         */
        // put your code here
        final Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        int lenghOfMonth = date.lengthOfMonth();
        for (int i = 1; i <= lenghOfMonth; i++) {
            LocalDate dateTmp = LocalDate.of(year, month, i);
            DayOfWeek tmpDayOfWeek = dateTmp.getDayOfWeek();
            if (tmpDayOfWeek == DayOfWeek.MONDAY) {
                System.out.println(dateTmp);
            }
        }
    }

    //Print dates of a year with an offset
    public static void main(String[] args){
        /**
         * Write a program that reads a starting date and an offset in days, and then prints all dates of this year with a specified offset from the starting date.
         * The program should print dates in the ascending order.
         *
         * The output must include the starting date.
         * Sample Input 1:
         * 2017-12-19
         * 4
         * Sample Output 1:
         * 2017-12-19
         * 2017-12-23
         * 2017-12-27
         * 2017-12-31
         * Sample Input 2:
         * 2017-06-30
         * 60
         * Sample Output 2:
         * 2017-06-30
         * 2017-08-29
         * 2017-10-28
         * 2017-12-27
         */

        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        int offset = scanner.nextInt();

        LocalDate parseDate = LocalDate.parse(date);
        int endOfYear = parseDate.lengthOfYear();
        LocalDate lastDayOfYear = parseDate.withDayOfYear(endOfYear);

        while((lastDayOfYear.compareTo(parseDate)) >=0){
            System.out.println(parseDate);
            parseDate = parseDate.plusDays(offset);
        }

    }

    // LocalDateNthDateFromTheEndOfMonth
    public static void main0(String[] args) {
        /**
         * Write a program that prints the n-th day from the end of a month.
         * The program must read a year, a month and the offset from the end of the month.
         * Sample Input 1:
         * 2017 1 1
         * Sample Output 1:
         * 2017-01-31
         * @param args
         */

        // put your code here
        final Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        LocalDate date = LocalDate.of(year, num1, num2);
        LocalDate newDate = LocalDate.of(year, num1, date.lengthOfMonth() - num2 + 1);

        System.out.println(newDate);


        // final LocalDate firstDayOfNextMonth = LocalDate.of(year, num1, 1).plusMonths(1);
        // System.out.println(firstDayOfNextMonth.minusDays(num2));
    }


}
