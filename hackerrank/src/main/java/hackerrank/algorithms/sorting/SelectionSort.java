package hackerrank.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {9, 8, 3, 13, 87, 12, 99};

        System.out.println(Arrays.toString(arr));

        selectionSortAlg(arr);

        System.out.println(Arrays.toString(arr));
    }

    // selection sort algorithm
    public static void selectionSortAlg(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimum = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) { // if we find a smaller value
                    minimum = j;
                }
            }

            if (i != minimum) {
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            }

        }
    }
}
