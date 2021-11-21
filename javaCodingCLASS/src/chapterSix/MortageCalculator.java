package chapterSix;

import java.util.Scanner;

public class MortageCalculator {

    public static  double numeratorOfMortage(int principal, double interestRate, int numberOfMonthToPayBack ){
        double numeratorValue =  principal*(  interestRate* (Math.pow((1+interestRate), numberOfMonthToPayBack)));
        System.out.println(numeratorValue);
        return numeratorValue;
    }
    public  static double denominatorOfMortageCalculator(double interestRate, int numberOfMonthToPayBack){
        double dnominatorValue = (Math.pow((1+interestRate), numberOfMonthToPayBack ))-1;
        System.out.println(dnominatorValue);
        return dnominatorValue;
    }
    public static void mortageCalculatedValue(double numeratorValue,double denominatorValue){
        double mortage = numeratorValue / denominatorValue;
        System.out.println("Your mortage value is: $"+ mortage);
    }
    public  static boolean prefimatch(long cnumba, int d){
        System.out.println(get(cnumba, thesiz(d)) == d );
        System.out.println( thesiz((d)));
        return get(cnumba, (d)) == d;
    }
       public static  int thesiz(long cardn){
        String num = cardn + "";
        return num.length();
       }
       public  static long get(long cdnum, int k){
        if(thesiz(cdnum)> k){
            String a = cdnum +"";
            System.out.println(a);
           System.out.println(Long.parseLong(a.substring(0,k)) + " B");
            return Long.parseLong(a.substring(0,k));
        }
        return cdnum;

       }
    public static void main(String[]args){
      /** final byte PERCENT = 100;
        final  byte MonthInYear = 12;
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter your principal");
        int principal  = userInput.nextInt();
        System.out.println("enter your interest rate");
        double interestRate = userInput.nextDouble();
        System.out.println("enter months to pay back ");
        int monthToPayBack = userInput.nextInt();
        mortageCalculatedValue(numeratorOfMortage(principal,interestRate,monthToPayBack),denominatorOfMortageCalculator(interestRate,monthToPayBack ));

        */
        System.out.println(get(5234567891012345L, 5));
        System.out.println(prefimatch(5234567891012345L,5));
    }
}
