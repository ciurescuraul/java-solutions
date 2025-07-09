package hackerrank.algorithms.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 13;
        binarySearch(new int[]{5, 6, 8, 9, 11, 13, 17}, target);
    }

    private static void binarySearch(int[] arr, int target) {
        int left = 0; // 4
        int right = arr.length - 1; // 6

        while (left <= right) {
            int mid = (left + right) / 2; // 5
            if (arr[mid] == target) {
                System.out.println("The element " + arr[mid] + " is present at index " + mid);
                return; // return the target element and the index where the target element is found
            } else if (arr[mid] < target) {
                left = mid + 1; // continue searching in the right half
            } else {
                right = mid - 1; // continue searching in the left half
            }
        }
        System.out.println("Target element  was not found");
    }

}
