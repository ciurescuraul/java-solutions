package hackerrank.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {

    public static void main(String[] args) {

        int[] a = {4, 2, 3, 4,5,6, 3, 2, 1,1,5};

        List<Integer> arr = new ArrayList<>(a.length);
        for (int i : a) {
            arr.add(i);
        }

        System.out.println(lonelyInteger(arr));
    }

    private static int lonelyInteger(List<Integer> a) {
        // Using XOR to find the lonely integer
        int lonely = 0;
        for (int num : a) {
            lonely = lonely ^ num; // XOR operation
        }
        return lonely; // The result will be the lonely integer
    }
}
