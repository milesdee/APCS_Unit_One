import java.util.Scanner;

public class FindTheAverage {

    public static void main(String[] args) {

        // Create a Scanner object to get user input
        Scanner scan = new Scanner(System.in);
        // Create a total variable to keep track of the total value
        double total = 0;
        // Get four pieces of user input
        System.out.println("Please give me four values.");
        System.out.println("What's the first number?");
        total += scan.nextDouble();
        System.out.println(total);
        System.out.println("What's the second number?");
        total += scan.nextDouble();
        System.out.println(total);
        System.out.println("What's the third number?");
        total += scan.nextDouble();
        System.out.println(total);
        System.out.println("What's the fourth number?");
        total += scan.nextDouble();
        System.out.println("Thank you!");
        // Calculate the average
        double avg = (total/4);
        // Display the result
        System.out.println("The average is " + avg + "!");
    }

}
