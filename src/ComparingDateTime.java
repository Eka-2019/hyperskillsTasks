import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class ComparingDateTime {

    public static void main(String[] args) {
        containingDateTimePairsInARange();
        theIntersectionOfTimeRange();
        toBeInTimeIn30Min();
        theLatestDateTimePair();
        isTheDateBetweenTwoOtherDates();
        theNewYearIsComming();
    }


    public static void containingDateTimePairsInARange() {
        //   Counting date-time pairs in a range
        /**
         * Write a program that reads date-time pairs and counts how many date-time pairs belongs to the specified range (including the earlier date-time and excluding the later). If the borders of the range are equal and a date-time equal to them, doesn't count this date-time.
         *
         * Input data format
         *
         * The first line contains a border of the range (the earlier or later, it's unknown).
         * The second line contains another border of the range.
         * The third line contains an integer number N - a number of date-time pairs.
         * The following N lines consist of date-time pairs. Each pair has the format year-month-dayThour:second.
         *
         * Output data format
         *
         * The program must output an integer number - count of date-time pairs belongs to the given range.
         *
         * Important: earlier and later date are not the same as the start and the end date. You must determine which date is early.
         * Sample Input 1:
         * 2017-12-01T00:10
         * 2017-12-02T00:10
         * 3
         * 2017-12-01T00:10
         * 2017-12-01T13:50
         * 2017-12-02T00:10
         * Sample Output 1:
         * 2
         * Sample Input 2:
         * 2017-12-31T23:59
         * 2017-12-01T00:00
         * 1
         * 2017-12-01T00:00
         * Sample Output 2:
         * 1
         */

        Scanner scanner = new Scanner(System.in);
        String data1 = scanner.nextLine();
        LocalDateTime range1 = LocalDateTime.parse(data1);
        String data2 = scanner.nextLine();
        LocalDateTime range2 = LocalDateTime.parse(data2);
        int num = scanner.nextInt();
        scanner.nextLine();
        int y = 0;
        if (range1.isAfter(range2)) {
            LocalDateTime range = range1;
            range1 = range2;
            range2=range;
        }
        for (int i = 0; i < num; i++) {
            String data = scanner.nextLine();
            LocalDateTime date = LocalDateTime.parse(data);

            if (date.isAfter(range1) && date.isBefore(range2) || date.equals(range1)) {
                y = y + 1;
            }
        }
        System.out.println(y);

    }

    public static void theIntersectionOfTimeRange() {

        //  The intersection of time ranges
        /**
         * Write a program that reads time ranges and checks the range intervals intersects. Two ranges intersect if they have at least one common point in time (with a minute accuracy).
         *
         * Input data format
         *
         * The first and second lines contain time ranges. Each time range consists of early and late time separated by one space. The format of a time is hour:minute (there is no seconds, millis, nano, etc).
         *
         * Output data format
         *
         * The program must output "true" if the given intervals intersect, otherwise - "false".
         * Sample Input 1:
         * 00:10 00:20
         * 00:15 00:30
         * Sample Output 1:
         * true
         * Sample Input 2:
         * 13:50 14:40
         * 14:40 15:30
         * Sample Output 2:
         * true
         * Sample Input 3:
         * 20:20 21:40
         * 19:30 20:18
         * Sample Output 3:
         * false
         */


        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] range1 = scanner.nextLine().split(" ");
        String[] range2 = scanner.nextLine().split(" ");

//        LocalDate tmpDate = LocalDate.parse(data[0]);
//        Integer days = Integer.valueOf(data[1]);

//        LocalDate newYearDate = tmpDate.plusYears(1).withMonth(1).withDayOfMonth(1);
  //      LocalDate newDate = tmpDate.plusDays(days);
  //      if (newDate.compareTo(newYearDate) == 0) {
  //          System.out.println("true");
  //      } else {
  //          System.out.println("false");
  //      }

    }

    public static void toBeInTimeIn30Min() {
        // To be in time in 30 minutes

        /**
         * You'd like to visit a grocery store but there is one problem. Now is 19:30 and many stores will be closed soon. You have a list of stores near you. You need exactly 30 minutes to get to a store from the list.
         *
         * Write a program that determines which stores you will be able to reach.
         *
         * Input data format
         *
         * The first line contains a number of stores in the list. Following lines describe the stores with two attributes: store name and the closing time. They are separated by a space (a name has no any spaces).
         *
         * Output data format
         *
         * The program must output grocery stores you will be able to reach in 30 minutes. The order of stores in the output should be the same as in the input. Each store is in a new line.
         *
         * Sample Input 1:
         * 4
         * Tastyday 20:30
         * Food 20:00
         * Zehrs 19:00
         * Bonus 20:20
         * Sample Output 1:
         * Tastyday
         * Bonus
         * @param args
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        LocalTime now = LocalTime.of(19, 30);

        for (int i = 0; i < num; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            String tmpTime = data[1];
            LocalTime time = LocalTime.parse(tmpTime);

            if(time.isAfter(now.plusMinutes(30))){
                System.out.println(name);
            }

        }

    }

    public static void theLatestDateTimePair(){
        //   The latest date-time pair
        /**
         * Write a program that finds the latest date-time pair in the chronological ascending order.
         *
         * Input data format
         *
         * The first line contains an integer number N - the total number of dates in the input. The following N lines consist of dates. Each date has the format year-month-dayThour:minute.
         *
         * Output data format
         *
         * The program must output the latest date in the same format as the input.
         *
         * Sample Input 1:
         * 3
         * 2017-05-06T13:55
         * 2017-05-09T22:30
         * 2017-05-07T13:40
         * Sample Output 1:
         * 2017-05-09T22:30
         * Sample Input 2:
         * 1
         * 2017-05-03T13:33
         * Sample Output 2:
         * 2017-05-03T13:33
         */

        LocalDateTime max= LocalDateTime.of(1,1,1,0,0);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            String data = scanner.nextLine();
            LocalDateTime date = LocalDateTime.parse(data);

            if (date.isAfter(max))
            {
                max=date;
            }
        }
        System.out.println(max);
    }

    public static void isTheDateBetweenTwoOtherDates() {
        //  Is the date between two other dates?
        /**
         * Write a program that reads three dates from the standard input and checks that the first date is between the second and the third but doesn't equal to them.
         *
         * Input data format
         *
         * The single line contains three dates separated by the space character. Each date has the format year-month-day.
         *
         * Output data format
         *
         * The program must output "true" or "false".
         *
         * Sample Input 1:
         * 2017-10-13 2017-10-11 2017-10-15
         * Sample Output 1:
         * true
         * Sample Input 2:
         * 2017-05-06 2017-12-31 2017-01-01
         * Sample Output 2:
         * true
         * Sample Input 3:
         * 2017-04-04 2017-05-05 2017-06-06
         * Sample Output 3:
         * false
         */

        Scanner scanner = new Scanner(System.in);
        String[] data1 = scanner.nextLine().split(" ");

        LocalDate date1 = LocalDate.parse(data1[0]);
        LocalDate date2 = LocalDate.parse(data1[1]);
        LocalDate date3 = LocalDate.parse(data1[2]);

        if ((date1.isAfter(date2) && date1.isBefore(date3)) || (date1.isAfter(date3) && date1.isBefore(date2))) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

    public static void theNewYearIsComming() {
        //  The New Year is coming

        /**
         * Write a program for checking the New Year will come in N days from the specified date.
         *
         * Input data format
         *
         * The single input line contains a date in the format year-month-day ﻿and an integer N separated by one space character.
         *
         * Output data format
         *
         * The program must output "true" or "false".
         *
         * Sample Input 1:
         * 2017-01-01 364
         * Sample Output 1:
         * false
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        LocalDate tmpDate = LocalDate.parse(data[0]);
        Integer days = Integer.valueOf(data[1]);

        LocalDate newYearDate = tmpDate.plusYears(1).withMonth(1).withDayOfMonth(1);
        LocalDate newDate = tmpDate.plusDays(days);
        if (newDate.compareTo(newYearDate) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
