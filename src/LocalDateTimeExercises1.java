import java.time.LocalDateTime;
import java.util.Scanner;

public class LocalDateTimeExercises1 {

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

    public static LocalDateTime mergeSampleSolution(LocalDateTime dateTime1, LocalDateTime dateTime2) {
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
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }


}
