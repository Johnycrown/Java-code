package Chapter11;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.deepToString;
import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentTest {
   // SevenSegment mySevenSegment = new SevenSegment();

    @Test
    public void sevenSegmentScreenACanPrint() {
        SevenSegment mySevenSegment = new SevenSegment();
        mySevenSegment.sevenSegmentScreenA();
        int[][] array = mySevenSegment.getScreen();
        //int[][] screen = mySevenSegment.getScreen();
        // System.out.println(deepToString(screen));
        for (int counter = 0; counter < array.length - 1; counter++){
            assertEquals(1, array[0][counter]);
            System.out.println(counter);}
        }

    @Test
    public void sevenSegmentScreenBCanPrint() {
        SevenSegment mySevenSegment = new SevenSegment();
        mySevenSegment.sevenSegmentScreenB();
        int[][] array = mySevenSegment.getScreen();
        for (int counter = 0; counter < array.length-2 ; counter++) {
            assertEquals(1, array[counter][3]);
            System.out.println(counter);
        }

    }

    @Test
    public void sevenSegmentScreenCCanPrint() {
        SevenSegment mySevenSegment = new SevenSegment();
        mySevenSegment.sevenSegmentScreenC();
        int[][] array = mySevenSegment.getScreen();
        for (int counter = 2; counter < array.length ; counter++) {
            assertEquals(1, array[counter][3]);
            System.out.println(counter);
        }

    }
    @Test
    public void sevenSegmentScreenDCanPrint() {
        SevenSegment mySevenSegment = new SevenSegment();
        mySevenSegment.sevenSegmentScreenD();
        int[][] array = mySevenSegment.getScreen();
        for (int counter = 0; counter < array.length-1 ; counter++) {
            assertEquals(1, array[4][counter]);
            System.out.println(counter);
        }

    }
    @Test
    public void sevenSegmentScreenECanPrint() {
        SevenSegment mySevenSegment = new SevenSegment();
        mySevenSegment.sevenSegmentScreenE();
        int[][] array = mySevenSegment.getScreen();
        for (int counter = 2; counter < array.length ; counter++) {
            assertEquals(1, array[counter][0]);
            System.out.println(counter);
        }

    }
    @Test
    public void sevenSegmentScreenFCanPrint() {
        SevenSegment mySevenSegment = new SevenSegment();
        mySevenSegment.sevenSegmentScreenF();
        int[][] array = mySevenSegment.getScreen();
        for (int counter = 0; counter < array.length - 2; counter++) {
            assertEquals(1, array[counter][0]);
            System.out.println(counter);
        }
    }
    @Test
    public void sevenSegmentScreenGCanPrint() {
        SevenSegment mySevenSegment = new SevenSegment();
        mySevenSegment.sevenSegmentScreenG();
        int[][] array = mySevenSegment.getScreen();
        for (int counter = 0; counter < array.length-1 ; counter++) {
            assertEquals(1, array[2][counter]);
            System.out.println(counter);
        }

    }


}