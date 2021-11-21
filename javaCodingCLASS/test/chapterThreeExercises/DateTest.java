package chapterThreeExercises;

import org.junit.jupiter.api.Test;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;
class DateTest {
    Date myDate = new Date(2021,07,23);


  @Test
    void setMyYearTest(){
      Date myDate = new Date(2021,07,23);
      myDate.getYear();
      assertEquals(2021,myDate.getYear());

      myDate.setYear(2020);
      assertEquals(2020,myDate.getYear());

  }

    @Test
    void setMymonthTest(){

        myDate.setMonth(7);
        assertEquals(7,myDate.getMonth());


        myDate.setMonth(8);
        assertEquals(8,myDate.getMonth());





    }
    @Test
    void setMyDayTest(){
        myDate.setDay(06);
        assertEquals(06,myDate.getDay());

    }
    @Test
    void setDisplaytest() {
        Date myDate = new Date(2021,07,23);
        myDate.displayDate();


    }
}

