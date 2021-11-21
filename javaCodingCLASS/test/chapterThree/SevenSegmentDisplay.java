package chapterThree;

public class SevenSegmentDisplay {
   static int [][] sevenSegmentArray = {{1,1,1,1},{1,0,0,1},{1,1,1,1,},{1,0,0,1},{1,1,1,1,}};
    public static void main(String[]args){
       // sevenSegmentArray= new int [5][4];
       /** for (int counter2 = 0; counter2 < 4; counter2++){

            for(int counter = 0; counter < 4; counter++){
                sevenSegmentArray [counter2][ counter] = (int)Math.random();

            }

        }*/
        for (int counter=0; counter <sevenSegmentArray.length; counter++){
            for(int counter2 =0 ; counter2< sevenSegmentArray[counter].length ; counter2++){
                if (sevenSegmentArray[counter][counter2]==0)
                    System.out.print(" "+ " ");
                if (sevenSegmentArray[counter][counter2]==1)
                System.out.print(sevenSegmentArray[counter][counter2] + " ");


            }
            System.out.println();

        }





    }




}
