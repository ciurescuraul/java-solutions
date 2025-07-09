package hackerrank.algorithms.arrays;

public class LinearSearch {

    public static void main(String[] args) {
        linearSearch(new int[]{5, 7, 9, 12, 17}, 17);
    }

    public static void linearSearch(int[] arr, int target) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                System.out.println("Found element " + target + " at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
