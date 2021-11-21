package calculator;

public class Calculator {
    private boolean power;
    private int result;


    public void isOn() {
        this.power = !power;
    }

    public boolean geton(){
        return power;
    }

    public void add(int firstNumber, int secondNumber) {
        result = firstNumber + secondNumber;
    }

    public int getresult() {
        return result;
    }

    public void substract(int firstnumber, int secondNumber) {
        result = firstnumber - secondNumber;
    }

    public void multiply(int firstNumber, int secondNumber) {
        result= firstNumber * secondNumber;
    }

    public void divide(int firstNumber, int secondNumber) {
        result = firstNumber / secondNumber;
    }
}
