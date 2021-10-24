import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        int doorsArea, windowsArea, subtractedArea;
        double roomHeight, roomWidth, roomLength, wallsAnC, wallsBnD, ceilingArea, totalWallArea, neededPaint;
        final int paintBucket = 350;
        Scanner scan = new Scanner(System.in);
        System.out.println("Your room is square/rectangular. This is fact now.");
        System.out.print("How long is your room, in feet?   ");
        roomLength = scan.nextDouble();
        System.out.print("How wide is your room, in feet?   ");
        roomWidth = scan.nextDouble();
        System.out.print("How high are your ceilings, in feet?   ");
        roomHeight = scan.nextDouble();

        wallsAnC = (roomLength * roomHeight);
        wallsBnD = (roomWidth * roomHeight);
        ceilingArea = (roomWidth * roomLength);

        System.out.print("How many windows do you have?   ");
        windowsArea = (10 * scan.nextInt());
        System.out.print("How many doors do you have?   ");
        doorsArea = (15 * scan.nextInt());

        subtractedArea = (windowsArea + doorsArea);
        totalWallArea = (wallsAnC + wallsBnD - subtractedArea);
        neededPaint = (2 * totalWallArea + 2 * ceilingArea);

        System.out.println("The total area you are painting is " + (int)neededPaint + " square feet.");
        System.out.println("A single commercial bucket of paint contains 350 square feet's worth of paint");
        System.out.println("So you need " + (int)((neededPaint/paintBucket) + 1) + " buckets of paint.");
    }

}
