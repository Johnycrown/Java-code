package chapterSix;

public class PrimeNumber {
    public static void main(String[] args) {
       primeNumber(100);
        //System.out.println(isPrime(31));

    }

    public static void primeNumber(int numberOfPrime){

        int number = 2;
        for(int counter = 0; counter < numberOfPrime; ){
            if (isPrime(number)){
                System.out.print(number +"\t\t");
                counter++;
                if(counter%10 == 0) System.out.println();

            }

        number++;
        }

    }

    public static boolean isPrime(int number){
        for(int divisor = 2; divisor<number; divisor ++){
            if(number%divisor ==0)return false;
        }
        return true;
    }
}
