import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class LocalDateTimeExercises {


    public static void main(String[] args) {
        //   Whole hours between two date-time pairs
        /**
         * The problem statement
         * Write a program that reads two date-time pairs in the same year and calculates how many whole hours between them.
         *
         * Input data format
         * The first and the second lines contains a date-time pair year-month-dayThour:minute (without seconds and nanoseconds).
         *
         * Output data format
         * The line containing a integer non-negative number.
         * Sample Input 1:
         * 2017-06-15T01:50
         * 2017-06-16T01:10
         * Sample Output 1:
         * 23
         * Sample Input 2:
         * 2017-06-15T01:50
         * 2017-06-15T02:50
         * Sample Output 2:
         * 1
         */

        Scanner scanner = new Scanner(System.in);
        LocalDateTime tmpDate1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime tmpDate2 = LocalDateTime.parse(scanner.nextLine());

        int hoursInDate1 = (tmpDate1.getDayOfYear()-1)*24*60+(tmpDate1.getHour()*60+tmpDate1.getMinute());
        int hoursInDate2 = (tmpDate2.getDayOfYear()-1)*24*60+(tmpDate2.getHour()*60+tmpDate2.getMinute());
        int hoursDiff = Math.abs(hoursInDate1 - hoursInDate2);
        int hourDiffNew = (int) Math.floor(hoursDiff/60);

        System.out.println(hourDiffNew);

    }


    public static void main4(String[] args) {
        //  Adding N minutes
        /**
         * Write a program that reads date-time, adds N minutes to it and then prints resulting year, day of the year, hours and minutes. The input date-time format like "2017-12-31T22:30:15". The result date must be similar to "2018 139 19:50:15" (year, day of the year, hours, minutes, seconds). If the result has no seconds, the program must not print them.
         *
         * Input data format
         * The first line contains a date-time. The second line contains a number of minutes (N) to add.
         *
         * Output data format
         * The single line must contain a string with the result.
         * Sample Input 1:
         * 2017-12-31T22:30:15
         * 200000
         * Sample Output 1:
         * 2018 139 19:50:15
         * Sample Input 2:
         * 2017-05-05T15:20
         * 20
         * Sample Output 2:
         * 2017 125 15:40
         * Sample Input 3:
         * 2017-01-01T01:01:01
         * 5000000
         * Sample Output 3:
         * 2026 186 06:21:01
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime tmpDate = LocalDateTime.parse(scanner.nextLine());
        int minutes = scanner.nextInt();
        LocalDateTime newDate = tmpDate.plusMinutes(minutes);

        int year = newDate.getYear();
        int day = newDate.getDayOfYear();
        int hours = newDate.getHour();
        int min = newDate.getMinute();
        int sec = newDate.getSecond();
        LocalTime newTime = LocalTime.of(hours, min, sec);

        System.out.println(year +" "+ day+" "+newTime);

    }

    public static void main3(String[] args) {
        //   The passed hours since the beginning of year
        /**
         * The problem statement
         * Write a program that reads a date-time pair and calculates how many hours have passed since the beginning of the year (1st January, 00:00).
         *
         * Input data format
         * The first line contains a date-time pair in the format year-month-dayThour:minute:second.
         *
         * Output data format
         * The line containing an integer number.
         * Sample Input 1:
         * 2017-12-31T23:59:59
         * Sample Output 1:
         * 8759
         */

        Scanner scanner = new Scanner(System.in);
        LocalDateTime tmpDate = LocalDateTime.parse(scanner.nextLine());
        int day = tmpDate.getDayOfYear();
        int hours = tmpDate.getHour();
        int hoursFromBeginningOfTheYear = hours+((day-1)*24);

        System.out.println(hoursFromBeginningOfTheYear);
    }


        //  Merging date-time instances
        /**
         * Implement a method that takes instances of LocalDateTime class and merges their largest components into one object. You should consider the following components: years, months, days of months, hours, minutes and seconds.
         *
         * Sample Input 1:
         * 2018-10-20T22:30
         * 2017-12-30T22:31:45
         * Sample Output 1:
         * 2018-12-30T22:31:45
         */

        public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
            // write your code here
            int maxYear;
            int maxMonth;
            int maxDay;
            int maxHours;
            int maxMin;
            int maxSec;
            //LocalDateTime dateTime1 = LocalDateTime.of(int year1, int month1, int day1, int hours1, int min1, int sec1);

            int year1 = dateTime1.getYear();
            int year2 = dateTime2.getYear();
            if (year1 < year2) {
                maxYear = year2;
            } else  if (year2<year1){
                maxYear = year1;
            } else {
                maxYear = year1;
            }

            int month1 = dateTime1.getMonthValue();
            int month2 = dateTime2.getMonthValue();
            if (month1 < month2) {
                maxMonth = month2;
            } else  if (month2<month1){
                maxMonth = month1;
            } else {
                maxMonth = month1;
            }

            int day1 = dateTime1.getDayOfMonth();
            int day2 = dateTime2.getDayOfMonth();
            if (day1 < day2) {
                maxDay = day2;
            } else  if (day2<day1){
                maxDay = day1;
            } else {
                maxDay = day1;
            }

            int hours1 = dateTime1.getHour();
            int hours2 = dateTime2.getHour();
            if (hours1 < hours2) {
                maxHours = hours2;
            } else  if (hours2<hours1){
                maxHours = hours1;
            } else {
                maxHours = hours1;
            }

            int min1 = dateTime1.getMinute();
            int min2 = dateTime2.getMinute();
            if (min1 < min2) {
                maxMin = min2;
            } else  if (min2<min1){
                maxMin = min1;
            } else {
                maxMin = min1;
            }

            int sec1 = dateTime1.getSecond();
            int sec2 = dateTime2.getSecond();
            if (sec1 < sec2) {
                maxSec = sec2;
            } else  if (sec2<sec1){
                maxSec = sec1;
            } else {
                maxSec = sec1;
            }

            return LocalDateTime.of(maxYear, maxMonth, maxDay, maxHours, maxMin, maxSec);
        }

    public static LocalDateTime mergeCorrect(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        return LocalDateTime.of(
                Math.max(dateTime1.getYear(), dateTime2.getYear()),
                Math.max(dateTime1.getMonthValue(), dateTime2.getMonthValue()),
                Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth()),
                Math.max(dateTime1.getHour(), dateTime2.getHour()),
                Math.max(dateTime1.getMinute(), dateTime2.getMinute()),
                Math.max(dateTime1.getSecond(), dateTime2.getSecond())
        );
    }

        /* Do not change code below */
        public static void main2(String[] args) {
            final Scanner scanner = new Scanner(System.in);
            final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
            final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
            System.out.println(merge(firstDateTime, secondDateTime));
        }


    public static void main1(String[] args) {
        //   Add 11 hours and print the date
        /**
         * Write a program that reads date-time, adds 11 hours to it and then prints only the result date. The input date-time format like "2017-12-31T22:30". The result date must be similar to "2018-01-01".
         * Sample Input 1:
         * 2017-12-31T22:30
         * Sample Output 1:
         * 2018-01-01
         */
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime tmpDate = LocalDateTime.parse(scanner.nextLine());

        LocalDateTime newDate = tmpDate.plusHours(11);

        int year = newDate.getYear();
        int month = newDate.getMonthValue();
        int day = newDate.getDayOfMonth();
        LocalDate newDate1 = LocalDate.of(year, month, day);

        System.out.println(newDate1);
    }

    public static void main0(String[] args) {
        //   Add days and subtract hours
        /**
         * Write a program that reads date-time, number of days to add, and number of hours to subtract and performs the operations. The for input and output date-time like "2017-12-31T22:30".
         *
         * Input data format
         * The single line contains date-time and two numbers: days to add and hours to subtract. All input elements are separated by spaces.
         *
         * Output data format
         * The output must contain only a date-time in the described format.
         * Sample Input 1:
         * 2017-12-31T22:30 10 5
         * Sample Output 1:
         * 2018-01-10T17:30
         */

        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split(" ");
        String tmpDate = date[0];
        String tmpDays = date[1];
        Long days = Long.valueOf(tmpDays);
        String tmpHours = date[2];
        Long hours = Long.valueOf(tmpHours);

        LocalDateTime tmp = LocalDateTime.parse(tmpDate);
        LocalDateTime newTmpDate = tmp.plusDays(days);
        LocalDateTime newDate = newTmpDate.minusHours(hours);

        System.out.println(newDate);

    }


}
