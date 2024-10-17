import java.util.Arrays;

public class Bubblesort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[][] testArrays = {
                {5, 2, 9, 1, 5, 6},
                {1, 2, 3, 4, 5},
                {3, 5, 2, 2, 8},
                {10},
                {}
        };
        for (int[] arr : testArrays) {
            bubbleSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }
}
