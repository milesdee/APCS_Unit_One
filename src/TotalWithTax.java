public class TotalWithTax {

    public static void main(String[] args)
    {
        //Declare the variables and the constant.
        final double taxRate = 0.0825;
        double price = 13.12;
        double addedTax;
        double total;
        //Make the calculations and assign
        //the results to the appropriate variables.
        addedTax = (taxRate*price);
        total = (price + addedTax);
        //Print the results.
        System.out.println("The price was " + price + " dollars.");
        System.out.println("With a tax rate of " + taxRate + " percent,");
        System.out.println(addedTax + " dollars were added to the price.");
        System.out.println();
        System.out.println("The total comes out to: " + total + " dollars.");
    }
}
