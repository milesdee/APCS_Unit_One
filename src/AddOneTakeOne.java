import java.util.Scanner;

public class AddOneTakeOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a (whole) number: ");
        int input = scan.nextInt();
        int bigger = (input + 1);
        int smaller = (input - 1);
        System.out.println(input + "? Okay!");
        System.out.println(input + " is 1 higher than " + (smaller) + ",");
        System.out.println("and is 1 lower than " + (bigger) + ".");
    }
}
