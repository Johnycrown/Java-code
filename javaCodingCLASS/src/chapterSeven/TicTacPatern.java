package chapterSeven;

public class TicTacPatern {
    public static void main(String [] args){

        displayTictac();
    }
    public static void displayTictac(){
        String[][] patern = new String [3][3];
        String[] a = {"X", "O","X"};
        String[] b = {"O", "X", "O"};
        String[] c = {"X", "O","X"};

        patern[0] = a;
        patern[1] = b;
        patern[2] = c;


        for(int i = 0; i < patern.length; i++){
            for (int j = 0; j < patern.length ; j++){
                System.out.print(patern[i][j] + "\t ");
            }
            System.out.println();
        }

    }

}
