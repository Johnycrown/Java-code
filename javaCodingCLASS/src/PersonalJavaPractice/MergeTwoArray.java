package PersonalJavaPractice;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[]  a = {2,3,1};
        int[] b = {2,9,5,3};
        System.out.println(mergeTwoArrayWithoutRepetition(b,a));
    }

    public static List<Integer> mergeTwoArrayWithoutRepetition(int[] firstArray, int[] secondArray) {
        List<Integer> combineArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<firstArray.length){

         if    (!combineArray.contains(firstArray[i])){
             combineArray.add(firstArray[i]);
             i++;
         }
        }
        while(j<secondArray.length){
            if(!combineArray.contains(secondArray[j])){
                combineArray.add(secondArray[j]);
            }
            j++;
        }
//

  return combineArray;
    }
}