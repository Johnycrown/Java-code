package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account yetundeAccount;
    @BeforeEach
    void setUp(){
        yetundeAccount = new Account();
    }


    @Test
    public void accountCanDepositTest(){
        yetundeAccount.deposit(150);
        //check
        int yetundeBalance = yetundeAccount.getbalance();
        assertEquals(150, yetundeBalance );

    }

    @Test
    public void withdrawal() {
        int yetundeBalance = yetundeAccount.getbalance();
        assertEquals(0, yetundeBalance);
       yetundeAccount.deposit(150);
        yetundeAccount.withdrawal(70, 212);
        assertEquals(80,yetundeAccount.getbalance());
    }
    @Test
    public void Cannotdepositnegativevalue(){
        //given
        yetundeAccount.deposit(400);

        //when
        yetundeAccount.deposit(-129);
        //check
        int  yetundeBalance = yetundeAccount.getbalance();
        assertEquals(400, yetundeBalance);
    }
    @Test
    public void withdrawalGreaterThanBalance(){

        yetundeAccount.deposit(400);

        yetundeAccount.withdrawal(500, 212);
        int yetundeBalance = yetundeAccount.getbalance();
        assertEquals(400, yetundeBalance);
    }
    @Test
    public void CannotWithdrawWithOuthPin(){
        yetundeAccount.deposit(600);
        yetundeAccount.withdrawal(400,213);
        int yetundeBalance = yetundeAccount.getbalance();
        assertEquals(600, yetundeBalance);

    }
         @Test
     public void multipleDeposit(){
        yetundeAccount.deposit(200);
        yetundeAccount.deposit(500);
        yetundeAccount.deposit(300);
        int yetundeBalance = yetundeAccount.getbalance();
        assertEquals(1000, yetundeBalance);
         }




}