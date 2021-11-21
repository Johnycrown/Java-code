package chapterFour;

import java.util.Scanner;

public class Barchart {
    public static void main(String[] args) {

        String asterik = "*";

        Scanner input = new Scanner(System.in);
        System.out.println("enter five numbers of your choice between 1 and 30");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        while (!(number1 >= 1 && number1 <= 30)) {
            System.out.println("enter five numbers of your choice between 1 and 30");
            number1 = input.nextInt();
        }

        while (!(number2 >= 1 && number2 <= 30)) {
            System.out.println("enter five numbers of your choice between 1 and 30");
            number2 = input.nextInt();
        }

        while (!(number3 >= 1 && number3 <= 30)) {
            System.out.println("enter five numbers of your choice between 1 and 30");
            number3 = input.nextInt();
        }

        while (!(number4 >= 1 && number4 <= 30)) {
            System.out.println("enter five numbers of your choice between 1 and 30");
            number4 = input.nextInt();
        }

        while (!(number5 >= 1 && number5 <= 30)) {
            System.out.println("enter five numbers of your choice between 1 and 30");
            number5 = input.nextInt();
        }
        for(int counter=1; counter<=number1; counter++){
            System.out.print( asterik ); }
        System.out.println();



        for(int counter=1; counter<=number2; counter++){
            System.out.print( asterik );}
        System.out.println();


        for(int counter=1; counter<=number3; counter++){
            System.out.print( asterik ); }
        System.out.println();



        for(int counter=1; counter<=number4; counter++){
            System.out.print( asterik );
        }
        System.out.println();



        for(int counter=1; counter<=number5; counter++){
            System.out.print( asterik );

        }
        System.out.println();

    }

    }

