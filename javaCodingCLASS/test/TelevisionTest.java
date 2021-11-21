import chapterThree.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television samsung;
    @BeforeEach
   void setUp(){
        samsung = new Television();
    }

   @Test
    void  televisionCanBeTurnedOnTest(){
       assertFalse(samsung.getTelevisionTurned());
       samsung.televisionCanBeTurnedOn();
       assertTrue(samsung.getTelevisionTurned());
    }
    @Test
    void  televisionCanBeTurnedOffTest(){
        samsung.televisionCanBeTurnedOn();
        assertTrue(samsung.getTelevisionTurned());


        samsung.televisionCanBeTurnedOn();
        assertFalse(samsung.getTelevisionTurned());

    }
    @Test
    void  televisionCanIncreaseChannelTest(){
        samsung.televisionCanBeTurnedOn();
        assertTrue(samsung.getTelevisionTurned());
        samsung.increaseTelevisionChanenel();
        samsung.increaseTelevisionChanenel();
        samsung.increaseTelevisionChanenel();

        assertEquals(3, samsung.getTelevisionChannel());
    }
    @Test
    void  televisionCanDecreaseChannelTest() {
        samsung.televisionCanBeTurnedOn();
        assertTrue(samsung.getTelevisionTurned());
        samsung.increaseTelevisionChanenel();
        samsung.increaseTelevisionChanenel();
        samsung.decreaseTelevisionChanenel();



        assertEquals(1, samsung.getTelevisionChannel());
    }
    @Test
    void  televisionCanIncreaseVoulmeTest(){
        samsung.televisionCanBeTurnedOn();
        assertTrue(samsung.getTelevisionTurned());
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();

        assertEquals(4,samsung.getVolume());

    }
    @Test
    void  televisionCanDecreaseVoulmeTest(){
        samsung.televisionCanBeTurnedOn();
        assertTrue(samsung.getTelevisionTurned());
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.decreaseVolume();


        assertEquals(3,samsung.getVolume());

    }


}
