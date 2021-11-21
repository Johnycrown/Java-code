package chapterFive;

public class TabularOutput {
    public static void main(String [] args){
        System.out.println("N\t10*N\tN*100\tN*1000");
        System.out.println();
        for(int counter = 1 ; counter <= 5; counter++){
            System.out.println( counter + "\t" + counter*10 + "  \t" + counter*100 + "  \t" + counter*1000);

        }

    }

}
