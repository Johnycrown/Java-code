public class Kata {
    int digit;
    int counter = 1;
    int factorial = 1;
    int square;
    int totalAmount;


    public int calculateFactoria(int i) {
        digit = i;

        while (counter <= digit) {
            factorial = factorial * counter;

            counter++;
        }
        return factorial;
    }

    public int calculateSquare(int i) {
        square = i * i;

        return square;
    }

    public int pricePerUnits(int unit) {

        if (unit >=1 && unit <= 4) {totalAmount = unit * 1500;}
        if (unit >4 && unit < 10) {totalAmount = unit * 1400;}
        if (unit >9 && unit <= 29) {totalAmount = unit * 1200;}
        if (unit >29 && unit <= 49) {totalAmount = unit * 1100;}
        if (unit > 49 && unit <= 99) {totalAmount = unit * 1000;}
        if (unit > 99 && unit <= 199) {totalAmount = unit * 900;}
        if (unit >=200) {totalAmount = unit * 800;}


        return totalAmount;
    }
}

