import java.util.Scanner;
public class CorrectChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int change = scan.nextInt();
        System.out.println(change + " cents:");

        int dollarcount = ((change - (change % 100 )) / 100);
        System.out.println(dollarcount + " dollar(s)");

        change = (change % 100);
        System.out.println(change + " cents remaining");

        int quartercount = ((change - (change % 25)) / 25);
        System.out.println(quartercount + " quarter(s)");

        change = (change % 25);
        System.out.println(change + " cents remaining");

        int dimecount = ((change - (change % 10)) / 10 );
        System.out.println(dimecount + " dime(s)");

        change = ( change % 10);
        System.out.println(change + " cents remaining");

        int nickelcount = ((change - (change % 5)) / 5);
        System.out.println(nickelcount + " nickel(s)");

        change = (change % 5);
        System.out.println(change + " cents remaining");

        int pennycount = change;
        System.out.println(pennycount + " pennies");

        change = (change - change);
        System.out.println(change + " cents remaining");

    }
}
