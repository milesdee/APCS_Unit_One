import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what month is it?");
        String month = scan.nextLine();
        System.out.println("what day is it?");
        int day = scan.nextInt();
        System.out.println("and what year?");
        int year = scan.nextInt();
        System.out.println("and what day of the week is it?");
        String dayOfWeek = scan.nextLine();

        System.out.println("So today is " + dayOfWeek + ", " + month + " " + day + ", " + year + ".");
    }
}
