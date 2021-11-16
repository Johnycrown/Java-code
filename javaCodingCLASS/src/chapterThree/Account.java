package chapterThree;

public class Account {
    private int balance;


    public void deposit(int amountToDeposit) {
       if (amountToDeposit > 0)
        balance  = balance + amountToDeposit;


    }

    public int getbalance() {


        return balance;

    }
     public void withdrawal(int amountToWithdraw, int pin){
        if(amountToWithdraw <= balance & pin == 212)

        balance = balance - amountToWithdraw;
     }

}
