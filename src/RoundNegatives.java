import java.util.Scanner;

public class RoundNegatives {

    public static void main(String[] args)
    {
        // Create a Scanner object and write a prompt for the user to enter a number
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a decimal to round into a whole number: ");
        // Declare a variable of the correct type that will receive the input from the user.
        double input = scan.nextDouble();
        // Declare a variable and write an expression to round the user input
        // ex. int roundedNum=/*expression to round a negative value*/;
        int inputRounded = (int)(input + 0.5);
        // Write a statement that will output the result in the form below.
        // ex. -3.21 rounded to a whole number is -3
        System.out.println(input + " rounded to the nearest whole number is " + inputRounded + ".");

    }
}
