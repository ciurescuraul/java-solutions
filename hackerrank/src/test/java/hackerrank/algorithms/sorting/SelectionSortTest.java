package hackerrank.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {
    private static final int[] SORTED_ARRAY = new int[]{3, 8, 9, 12, 13, 87, 99};

    @Test
    void testSelectionSortAlgorithm() {

        int[] arr = {9, 8, 3, 13, 87, 12, 99};

        int[] actual = SelectionSort.algorithm(arr);

        assertArrayEquals(SORTED_ARRAY, actual);
    }
}