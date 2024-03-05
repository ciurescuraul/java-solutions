package hackerrank.algorithms.data_structures;

/*
Given an array of integers, find the sum of its elements.

For example, if the array , ar = {1,2,3}, 1 + 2 + 3 = 6 so return 6 .
 */

public class SimpleArraySum {
    private static final int[] arr = {1,2,3,4,10,11};
    public static void main(String[] args) {

        System.out.println(simpleArraySum(arr));
    }

    public static int simpleArraySum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
