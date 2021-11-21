import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aircondition2Test {
    @Test
    public void acCanOn(){
        Aircondition2 myaircondition = new Aircondition2 ();

        myaircondition.acCanOn(false);
        myaircondition.getAC();
        assertFalse(myaircondition.getAC());}
    @Test
    public void acCanOff(){
            Aircondition2 myaircondition = new Aircondition2 ();

            myaircondition.acCanOn(true);
            myaircondition.getAC();
            assertTrue(myaircondition.getAC());

        }
    @Test
    public void temperatureCanBeIncreased(){
        Aircondition2 myaircondition = new Aircondition2 ();

        myaircondition.acCanOn(true);
        myaircondition.acCanIncrease();
        assertEquals(17,myaircondition.getACIncrease());

    }

    @Test
    public void temperatureCanBeDecreased(){
        Aircondition2 myaircondition = new Aircondition2 ();

        myaircondition.acCanOn(true);
        myaircondition.acCanDecrease();
        assertEquals(0,myaircondition.getACIncrease());

    }

    }

