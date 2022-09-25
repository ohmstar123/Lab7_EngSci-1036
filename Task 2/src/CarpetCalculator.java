import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {

        //Declare scanner
        Scanner input = new Scanner(System.in);

        //Ask user for price per square foot
        System.out.println("Enter the price per square foot: ");
        double price = input.nextDouble();

        //Ask user for length of their room
        System.out.println("Enter the length of the room: ");
        double length = input.nextDouble();

        //Ask user for width of their room
        System.out.println("Now enter the width of the room: ");
        double width = input.nextDouble();

        //Two instances, one for RoomDimension and one for RoomCarpet
        RoomDimension rd = new RoomDimension(length, width);
        RoomCarpet rc = new RoomCarpet(rd, price);

        //Print room dimensions and cost
        System.out.println("Room dimensions:\n" + rd.toString() + "\n" + rc.toString());


    }
}
