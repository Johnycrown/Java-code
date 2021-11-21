package Chapter11;

import java.util.Scanner;

public class SevenSegment {
    private int[][] arrays = new int[5][4];
    Scanner input = new Scanner(System.in);

    public static  void defaultDisplayScreen() {

         int[][] sevenSegmentArray = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1,}, {1, 0, 0, 1}, {1, 1, 1, 1,}};
        for (int counter = 0; counter < sevenSegmentArray.length; counter++) {
            for (int counter2 = 0; counter2 < sevenSegmentArray[counter].length; counter2++) {
                if (sevenSegmentArray[counter][counter2] == 0)
                    System.out.print(" " + " ");
                if (sevenSegmentArray[counter][counter2] == 1)
                    System.out.print("#" + " ");


            }
            System.out.println();

        }
    }

    public void setUpArrays(String collectUserInput){
        while (collectUserInput.length()>8){
            System.out.println("you cannot enter more than length of 8");
            collectUserInput = input.nextLine();

        }
        
        for (int row = 0; row < collectUserInput.length(); row++){
            switch (row){
                case 0:
                    int a = Character.getNumericValue(collectUserInput.charAt(row));
                    if (a == 1){sevenSegmentScreenA();}
                    break;
                case 1:
                    int b = Character.getNumericValue(collectUserInput.charAt(row));
                    if (b == 1){sevenSegmentScreenB();}
                    break;
                case 2:
                    int c = Character.getNumericValue(collectUserInput.charAt(row));
                    if (c == 1){sevenSegmentScreenC();}
                    break;
                case 3:
                    int d = Character.getNumericValue(collectUserInput.charAt(row));
                    if (d == 1){sevenSegmentScreenD();}
                    break;
                case 4:
                    int e = Character.getNumericValue(collectUserInput.charAt(row));
                    if (e == 1){sevenSegmentScreenE();}
                    break;
                case 5:
                    int f = Character.getNumericValue(collectUserInput.charAt(row));
                    if (f == 1){sevenSegmentScreenF();}
                    break;
                case 6:
                    int g = Character.getNumericValue(collectUserInput.charAt(row));
                    if (g == 1){sevenSegmentScreenG();}
                    break;
                case 7:
                    int h = Character.getNumericValue(collectUserInput.charAt(row));
                    if (h == 0){clearScreen();}
                    break;
            }
        }
    }

    public static int[][] sevenSegment() {
        int[][] sevenArrays = new int[][]{{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        return sevenArrays;
    }

    public void sevenSegmentScreenA(){
        arrays[0][0] = 1;
        arrays[0][1] = 1;
        arrays[0][2] = 1;
        arrays[0][3] = 1;
    }

    public void sevenSegmentScreenB(){
        arrays[0][3] = 1;
        arrays[1][3] = 1;
        arrays[2][3] = 1;
    }

    public void sevenSegmentScreenC(){
        arrays[2][3] = 1;
        arrays[3][3] = 1;
        arrays[4][3] = 1;
    }

    public void sevenSegmentScreenD(){
        arrays[4][0] = 1;
        arrays[4][1] = 1;
        arrays[4][2] = 1;
        arrays[4][3] = 1;
    }

    public void sevenSegmentScreenE(){
        arrays[2][0] = 1;
        arrays[3][0] = 1;
        arrays[4][0] = 1;
    }

    public void sevenSegmentScreenF(){
        arrays[0][0] = 1;
        arrays[1][0] = 1;
        arrays[2][0] = 1;
    }

    public void sevenSegmentScreenG(){
        arrays[2][0] = 1;
        arrays[2][1] = 1;
        arrays[2][2] = 1;
        arrays[2][3] = 1;
    }

    public void clearScreen(){
        int[][] zeroArrays = arrays;
        for (int row = 0; row < zeroArrays.length; row++){
            for (int column = 0; column < zeroArrays[0].length; column++){
                zeroArrays[row][column] = 0;
            }
        }
    }

    public void displaySevenSegment(){
        int [][] arraysToDisplay = arrays;
        for (int row = 0; row < arraysToDisplay.length; row++){
            for (int column = 0; column < arraysToDisplay[0].length; column++){
                if (arraysToDisplay[row][column] == 1){
                    System.out.print("# ");
                }else if (arraysToDisplay[row][column] == 0){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public int[][] getScreen() {
        return arrays;
    }
}
