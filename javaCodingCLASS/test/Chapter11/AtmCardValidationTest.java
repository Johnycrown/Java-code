package Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmCardValidationTest {
    AtmCardValidation myCard = new AtmCardValidation();
    @Test
    public void theLenghthOfCardCanBeDetermine(){
        AtmCardValidation myCard = new AtmCardValidation();

        assertEquals(9, myCard.getTheSizeOfCard(123456789));
    }
    @Test
    public void theCardPrefixCanbeDetermine(){
        AtmCardValidation.getPrefix(123456789124567L, 4);
        assertEquals(1234, AtmCardValidation.getPrefix(123456789124567L, 4));

    }
    @Test
    public  void cardPrefixMatchTest(){
        AtmCardValidation.prefixMatch(234678934,5);
        assertEquals(true,AtmCardValidation.prefixMatch(374678934,37));



    }
    @Test
    public void cardSumOfEvenDoubleCanbeDetermineTest(){
        AtmCardValidation.sumDoubleEvenNumber(123456);
        assertEquals(37,AtmCardValidation.sumDoubleEvenNumber(4388576018402626l));

    }
    @Test
    public  void sumOfCardofOdddigt(){

        assertEquals(38,AtmCardValidation.sumOddNumber(4388576018402626l));
    }


}