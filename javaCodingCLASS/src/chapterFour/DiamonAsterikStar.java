package chapterFour;

public class DiamonAsterikStar {
    public static void main(String [] args ){
        String asterik = "*";
        for(  int counter = 1; counter <=10; counter+=2){
            for (int counterb = 10; counterb >= counter ; counterb-=2){
                System.out.print(" " );
            }

            for (int counterb = 1; counterb <= counter ; counterb++){
                System.out.print( asterik );
            }
            System.out.println();

        }
        for(  int counter = 1; counter <=10; counter+=2){

            for (int counterb = 0; counterb <= counter ; counterb+=2){
                System.out.print(" " );
            }

            for (int counterb = 9; counterb >= counter ; counterb--){
                System.out.print( asterik );
            }
            System.out.println();
        }



    }
}
