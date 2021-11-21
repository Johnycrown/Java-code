import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BikeTest {
    Bike bike;
        @BeforeEach
        void setUp(){
        bike = new Bike();
    }
    @Test
    void biKeCanbeturnedOnTest(){

            assertFalse(bike.getBikeTurnedOnandOff());
            bike.bikeCanBeTurnedOnAndOff();
        assertTrue(bike.getBikeTurnedOnandOff());
    }
    @Test
    void biKeCanbeturnedOffTest() {
        bike.bikeCanBeTurnedOnAndOff();
        assertTrue(bike.getBikeTurnedOnandOff());
        bike.bikeCanBeTurnedOnAndOff();
        assertFalse(bike.getBikeTurnedOnandOff());

        }

        @Test
    void bikeCanBeAccellerated(){
            bike.bikeCanBeTurnedOnAndOff();
            assertTrue(bike.getBikeTurnedOnandOff());
            bike.setBikeAccelerated(31);
            assertEquals(34, bike.getBikeSpeed() );


        }
      @Test
      void setBikeDecceleratedTest(){
          bike.bikeCanBeTurnedOnAndOff();
          assertTrue(bike.getBikeTurnedOnandOff());
          bike.setBikeDeccelerated(45);
          assertEquals(41, bike.getBikeSpeed() );

      }
      @Test
      void setBikeGearTest(){
          bike.bikeCanBeTurnedOnAndOff();
          assertTrue(bike.getBikeTurnedOnandOff());
          bike.setBikeGear(57);
          assertEquals(4, bike.getBikegear());


      }

}

