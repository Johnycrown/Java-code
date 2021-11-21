import static org.junit.jupiter.api.Assertions.*;
import chapterThree.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MP3Test {
    MP3 lg;
    @BeforeEach
    void setUp(){
        lg = new MP3();
    }

    @Test
    void  lgCanBeTurnedOnTest(){
        assertFalse(lg.getMP3Turned());
        lg.MP3CanBeTurnedOn();
        assertTrue(lg.getMP3Turned());
    }
    @Test
    void  MP3CanBeTurnedOffTest(){
        lg.MP3CanBeTurnedOn();
        assertTrue(lg.getMP3Turned());


        lg.MP3CanBeTurnedOn();
        assertFalse(lg.getMP3Turned());

    }
    @Test
    void  MP3CanIncreaseChannelTest(){
        lg.MP3CanBeTurnedOn();
        assertTrue(lg.getMP3Turned());
        lg.increaseMP3Chanenel();
        lg.increaseMP3Chanenel();
        lg.increaseMP3Chanenel();

        assertEquals(3, lg.getMP3Channel());
    }
    @Test
    void  televisionCanDecreaseChannelTest() {
        lg.MP3CanBeTurnedOn();
        assertTrue(lg.getMP3Turned());
        lg.increaseMP3Chanenel();
        lg.increaseMP3Chanenel();
        lg.decreaseMP3Chanenel();



        assertEquals(1, lg.getMP3Channel());
    }
    @Test
    void  MP3CanIncreaseVoulmeTest(){
        lg.MP3CanBeTurnedOn();
        assertTrue(lg.getMP3Turned());
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();

        assertEquals(4,lg.getVolume());

    }
    @Test
    void  MP3CanDecreaseVoulmeTest(){
        lg.MP3CanBeTurnedOn();
        assertTrue(lg.getMP3Turned());
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
       lg.decreaseVolume();


        assertEquals(3,lg.getVolume());

    }


}



