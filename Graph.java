package Chapter11;

public class Graph {
    public static void bubbleSort(int[] array) {
        int start = 1;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + start]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    for (int k : array) {
                        System.out.print(k);
                        System.out.print(",");

                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arrag = {1, 2, 8,9,3,6,10,7, 4, 5,};
        bubbleSort(arrag);
    }

}