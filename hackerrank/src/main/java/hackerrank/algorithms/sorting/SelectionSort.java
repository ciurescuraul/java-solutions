package hackerrank.algorithms.sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {9, 8, 3, 13, 87, 12, 99};

        int[] myArray = algorithm(arr);

        printSorted(myArray);
    }

    // selection sort algorithm
    public static int[] algorithm(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimum = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) { // if we find a smaller value
                    minimum = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
        return arr;
    }


    // print array method
    private static void printSorted(int[] ints) {
        System.out.print("Sorted array: ");

        for (int n : ints) {
            System.out.print(n + " ");
        }
    }
}
