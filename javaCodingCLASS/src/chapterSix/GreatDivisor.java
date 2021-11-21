package chapterSix;

import java.util.Scanner;

public class GreatDivisor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the first Number");
        int firsNumber = userInput.nextInt();
        System.out.println("enter the second number");
        int secodNumber = userInput.nextInt();
        System.out.println("the greatest divisor of " + firsNumber + " and " + secodNumber + " is " + determineTheLargestDivisor(firsNumber,secodNumber));

    }

    public static int determineTheLargestDivisor(int firstNumber, int secondNumber) {
        int divisor = 2;
        int placeHolderOfHighestDivisor = 1;
        while (divisor <= firstNumber && divisor <= secondNumber) {
            if(firstNumber%divisor == 0 && secondNumber%divisor == 0){
                placeHolderOfHighestDivisor = divisor;
            }
                  divisor++;
        }

      return placeHolderOfHighestDivisor;
    }
}


