import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void  CalculateFactorialTest(){
        Kata kata = new Kata();
        int result = kata.calculateFactoria(6);
        assertEquals(720, result);

    }
    @Test
    void calculateSquare(){
        Kata kata = new Kata();
        int square = kata.calculateSquare(4);
        assertEquals(16, square);
    }
    @Test
    void calculateUnitPrice(){
        Kata kata = new Kata();
       int result =  kata.pricePerUnits(2);
        assertEquals(3000, result );}


        @Test
        void calculateUnitPricebetween5and9(){
            Kata kata = new Kata();
            int result =  kata.pricePerUnits(5);
            assertEquals(7000, result );
              }
    @Test
    void calculateUnitPricebetween10and29(){
        Kata kata = new Kata();
        int result =  kata.pricePerUnits(11);
        assertEquals(13200, result );
    }

    @Test
    void calculateUnitPricebetween30and49(){
        Kata kata = new Kata();
        int result =  kata.pricePerUnits(46);
        assertEquals(50600, result );
    }
    @Test
    void calculateUnitPricebetween50and99(){
        Kata kata = new Kata();
        int result =  kata.pricePerUnits(99);
        assertEquals(99000, result );
    }


    @Test
    void calculateUnitPricebetween100and199(){
        Kata kata = new Kata();
        int result =  kata.pricePerUnits(199);
        assertEquals(179100, result );
    }
    @Test
    void calculateUnitPriceGreaterThan200(){
        Kata kata = new Kata();
        int result =  kata.pricePerUnits(200);
        assertEquals(160000, result );
    }

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kata kata = new Kata();
       System.out.println("enter any number ");
       int userinput = input.nextInt();

        System.out.println("what do you want to do \n 1 -> factorial \n 2 -> square");
       int userinput2 = input.nextInt();

        if (userinput2 == 1) System.out.println(kata.calculateFactoria(userinput));

        if (userinput2 == 2){ System.out.println(kata.calculateSquare(userinput));




        }

    }

}