import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Prompt the user for a positive decimal number
        System.out.println("Give me two decimals to round into the nearest tenth: ");
        double input = scan.nextDouble();
        double secondInput = scan.nextDouble();
        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/
        double inputRoundedTenth;
        double secondInputRoundedTenth;
        inputRoundedTenth = (double)((int)((input * 10) + 0.5))/10;
        secondInputRoundedTenth = (double)((int)((secondInput * 10) + 0.5))/10;
        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5
        System.out.println(input + " rounded to the nearest tenth is " + inputRoundedTenth);
        System.out.println(secondInput + " rounded to the nearest tenth is " + secondInputRoundedTenth);
    }
}
