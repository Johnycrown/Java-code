package Chapter11;

public class AtmCardValidation {
    public  static int getTheSizeOfCard(long cardnumber){

        String cardNumber = cardnumber + "";
        return cardNumber.length();
    }
    public static  long getPrefix(long cardNumber, int cardFirstDigit){
        if(getTheSizeOfCard(cardNumber) > cardFirstDigit ){
            String cardNumberr = cardNumber + "";
            return Long.parseLong(cardNumberr.substring(0,cardFirstDigit)); }
        return cardNumber;

    }
    public static boolean prefixMatch(long cardNumber, int cardFirstDigit){
        if(getPrefix(cardNumber, getTheSizeOfCard(cardFirstDigit)) ==cardFirstDigit) {return true;}
        return false;
    }
    public static int getDigit(int number){
        if(number>9){
            int numberr = number/10 + number%10;
            return numberr;
        }
        return number;
    }
    public static int sumDoubleEvenNumber(long cardNumber){
        String stringCardNumber = cardNumber + "";
        int total = 0;
        for (int counter= getTheSizeOfCard(cardNumber)-2; counter>=0; counter -=2){
            total += getDigit(Integer.parseInt(stringCardNumber.charAt(counter)+"")*2);

        }
        return total;

    }
    public static  int sumOddNumber(long cardNumber){
        String stringCardNumber = cardNumber + "";
        int total = 0;
        for(int counter= getTheSizeOfCard(cardNumber)-1; counter>= 0; counter -=2){

            total += Integer.parseInt(stringCardNumber.charAt(counter)+""); }
return total;
    }
//   public static boolean isCardValid(long cardNumber){
//
//   }
}
