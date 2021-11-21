package Chapter11.MP3OOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    Mp3Player  johnMp3 = new Mp3Player();
    @Test
   public void mp3CanBeOnTest(){
        // given
        Mp3Player  johnMp3 = new Mp3Player();
        // when
      //
        assertEquals(Power.OFF, johnMp3.getPower());
        johnMp3.setMp3On();
        assertEquals(Power.ON, johnMp3.getPower());


        System.out.println(johnMp3.volume.getVolume());

    }
    @Test
    public void mp3CanBeOffTest(){
        // given
        Mp3Player  johnMp3 = new Mp3Player();
        // when
        //

        johnMp3.setMp3On();
        assertEquals(Power.ON, johnMp3.getPower());
        johnMp3.setMp3off();
        assertEquals(Power.OFF, johnMp3.getPower());

    }
    @Test
    public void mp3VolumeCanBeDecreaseTest(){
        Mp3Player  johnMp3 = new Mp3Player();
        johnMp3.setMp3On();
        assertEquals(Power.ON, johnMp3.getPower());
        for (int counter =0; counter < 3; counter++) johnMp3.volume.decreaseVolume();
        assertEquals(10, johnMp3.volume.getVolume());

    }
    @Test
    public void mp3VolumeCanNotBeDecreaseBeyondZeroTest(){
        Mp3Player  johnMp3 = new Mp3Player();
        johnMp3.setMp3On();
        assertEquals(Power.ON, johnMp3.getPower());
        for (int counter =0; counter < 9; counter++) johnMp3.volume.decreaseVolume();
        assertEquals(0, johnMp3.volume.getVolume());

    }
    @Test
    public void mp3VolumeCanBeIncreaseTest(){
        Mp3Player  johnMp3 = new Mp3Player();
        johnMp3.setMp3On();
        assertEquals(Power.ON, johnMp3.getPower());
        for (int counter =0; counter < 2; counter++) johnMp3.volume.increaseVolume();
        assertEquals(35, johnMp3.volume.getVolume());
    }

    @Test
    public void mp3VolumeCannotBeIncreaseMoreThan100Test(){
        Mp3Player  johnMp3 = new Mp3Player();
        johnMp3.setMp3On();
        assertEquals(Power.ON, johnMp3.getPower());
        for (int counter =0; counter < 25; counter++) johnMp3.volume.increaseVolume();
        assertEquals(100, johnMp3.volume.getVolume());
    }





}