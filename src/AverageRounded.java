import java.util.Scanner;

public class AverageRounded {

    public static void main(String[] args) {
        double total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 4 numbers to average! Don't be afraid to use decimals!");
        total += scan.nextDouble();
        total += scan.nextDouble();
        total += scan.nextDouble();
        total += scan.nextDouble();
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total/4));
        System.out.println("Rounded Average: " + (int)(total/4 + 0.5));
    }
}
