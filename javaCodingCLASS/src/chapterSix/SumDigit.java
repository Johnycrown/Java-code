package chapterSix;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = in.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(long digit) {
        int result = 0;

        while(digit > 0) {
            result += digit % 10;
            digit /= 10;
        }

        return result;
    }
}
