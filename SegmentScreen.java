package Chapter11;

import java.util.Scanner;

public class SegmentScreen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.defaultDisplayScreen();
        System.out.println("Enter 8 digits in 0s and 1s to print your seven segment screen: ");
        String collectUserInput = input.nextLine();
        sevenSegment.setUpArrays(collectUserInput);
        sevenSegment.displaySevenSegment();
    }
}
