public class TemperatureConversion {

    public static void main(String[] args) {

        // Create a variable of the appropriate type and initialize to to 78 degrees
        double fTemp;
        fTemp = 78;
        // Create a second variable and write an expression to convert the value above to Celsius
        double cTemp;
        cTemp = ((fTemp - 32) / 1.800);
        // Display the results to the user:
        // ex. 212 degrees F is 100 degrees C
        System.out.println(fTemp + "º Fahrenheit = " + cTemp + "º Celsius.");
    }
}
