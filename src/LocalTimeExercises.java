
import java.time.LocalTime;
import java.util.Scanner;

public class LocalTimeExercises {

    public static void main(String[] args) {
        secondsSinceStartDay();
        secondsBetweenTwoTimePoints();
        removeSecondsFromPointInTime();
        hoursAndMinutesAgo();
    }


    public static void secondsSinceStartDay() {
        //  Seconds since start of a day

        /**
         * Write a program that reads a number of seconds since the start of a day and prints the current time.
         * If the resulting time has no seconds, do not output them.
         * Sample Input 1:
         * 12345
         * Sample Output 1:
         * 03:25:45
         * Sample Input 2:
         * 60000
         * Sample Output 2:
         * 16:40
         * Sample Input 3:
         * 3600
         * Sample Output 3:
         * 01:00
         * @param args
         */
        Scanner scanner = new Scanner(System.in);
        int quantityOfSeconds = scanner.nextInt();

        int h=quantityOfSeconds/3600;
        int m= (quantityOfSeconds-h*3600)/60;
        int sec = (quantityOfSeconds-h*3600)-m*60;

        LocalTime time = LocalTime.of(h, m, sec);

        System.out.println(time);

    }

    public static void secondsSinceStartDateSampleSolution() {
        final Scanner sc = new Scanner(System.in);

        final long secondsOfDay = sc.nextLong();
        final LocalTime time = LocalTime.ofSecondOfDay(secondsOfDay);

        System.out.println(time.toString());
    }

    public static void secondsBetweenTwoTimePoints() {
        // How many seconds between two time points

        /**
         * Implement a method that takes two instances of LocalTime and determines how many seconds between them.
         * Sample Input 1:
         * 00:00:01
         * 00:00:05
         * Sample Output 1:
         * 4
         * Sample Input 2:
         * 02:00:03
         * 00:00:01
         * Sample Output 2:
         * 7202
         * @param args
         */
        Scanner scanner = new Scanner(System.in);
        String[] tmpTime1 = scanner.nextLine().split(":");
        String[] tmpTime2 =scanner.nextLine().split(":");

        Integer hour = Integer.valueOf(tmpTime1[0]);
        Integer minutes = Integer.valueOf(tmpTime1[1]);
        Integer seconds = Integer.valueOf(tmpTime1[2]);

        Integer hour2 = Integer.valueOf(tmpTime2[0]);
        Integer minutes2 = Integer.valueOf(tmpTime2[1]);
        Integer seconds2 = Integer.valueOf(tmpTime2[2]);

        int sum = hour*3600+minutes*60+seconds;
        int sum1 = hour2*3600+minutes2*60+seconds2;

        System.out.println(Math.abs(sum -sum1));

    }

    public static void removeSecondsFromPointInTime() {
        // Remove seconds from a point in time
        /**
         * Write a program that reads a point in time and outputs the same time without seconds. Note, sometimes input time doesn't contain seconds.
         * Sample Input 1:
         * 18:10:55
         * Sample Output 1:
         * 18:10
         * Sample Input 2:
         * 19:30:30
         * Sample Output 2:
         * 19:30
         * @param args
         */
        Scanner scanner = new Scanner(System.in);
        String[] tmpTime = scanner.nextLine().split(":");

        Integer hour = Integer.valueOf(tmpTime[0]);
        Integer minutes = Integer.valueOf(tmpTime[1]);
        //Integer seconds = Integer.valueOf(tmpTime[2]);

        LocalTime time = LocalTime.of(hour, minutes);

        System.out.println(time);

    }

    public static void removeSecondsFromPointInTimeSampleSolution() {
        final Scanner sc = new Scanner(System.in);

        final String timeString = sc.next();
        final LocalTime time = LocalTime.parse(timeString).withSecond(0);

        System.out.println(time.toString());
    }

    public static void hoursAndMinutesAgo() {
        // Some hours and minutes ago
        /**
         * Write a program that reads a point in time and prints another point before this at the specified number of hours and minutes.
         *
         * Input data format
         *
         * The first line contains a point in time like 18:10 (hours:minutes). The second line contains two numbers - hours and minutes separated by a space.
         *
         * Output data format
         *
         * The single output line should contain a point in time before the input time in the same format.
         * Sample Input 1:
         * 18:10
         * 2 30
         * Sample Output 1:
         * 15:40
         * @param args
         */
        Scanner scanner = new Scanner(System.in);
        String[] tmpTime = scanner.nextLine().split(":");
        String[] tmpPeriod = scanner.nextLine().split(" ");

        Integer hour = Integer.valueOf(tmpTime[0]);
        Integer minutes = Integer.valueOf(tmpTime[1]);

        Integer hourPeriod = Integer.valueOf(tmpPeriod[0]);
        Integer minPeriod = Integer.valueOf(tmpPeriod[1]);

        LocalTime time = LocalTime.of(hour, minutes);
        LocalTime newTime = time.minusHours(hourPeriod).minusMinutes(minPeriod);

        System.out.println(newTime);

    }
}
