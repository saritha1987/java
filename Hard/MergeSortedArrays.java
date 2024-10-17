import java.util.Arrays;
public class MergeSortedArrays {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int n1 = array1.length, n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        System.out.println("Merged array: " + Arrays.toString(mergeArrays(array1, array2)));
        int[] array3 = {};
        int[] array4 = {1, 2, 3};
        System.out.println("Merged array: " + Arrays.toString(mergeArrays(array3, array4)));
        int[] array5 = {1, 2, 3};
        int[] array6 = {};
        System.out.println("Merged array: " + Arrays.toString(mergeArrays(array5, array6)));
    }
}