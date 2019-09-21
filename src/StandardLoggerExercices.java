import java.util.Scanner;

public class StandardLoggerExercices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] set = scan.nextLine().split(" ");
        int result = 0;

        for (int i = 0; i < set.length; i++) {
            if (set[i].equals("severe")) {
                result = result + 1000;
            }
            if (set[i].equals("warning")) {
                result = result + 900;
            }
            if (set[i].equals("info")) {
                result = result + 800;
            }
            if (set[i].equals("config")) {
                result = result + 700;
            }
            if (set[i].equals("fine")) {
                result = result + 500;
            }
            if (set[i].equals("finer")) {
                result = result + 400;
            }
            if (set[i].equals("finest")) {
                result = result + 300;
            }
        }
            System.out.println(result);


    }
}
