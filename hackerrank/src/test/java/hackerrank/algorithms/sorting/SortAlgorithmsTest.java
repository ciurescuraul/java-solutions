package hackerrank.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortAlgorithmsTest {
    private static final int[] ARRAY = new int[]{9, 8, 3, 13, 87, 12, 99};
    private static final int[] SORTED_ARRAY = new int[]{3, 8, 9, 12, 13, 87, 99};

    @Test
    void testBubbleSortAlgorithm() {
        BubbleSort.bubbleSortAlg(ARRAY);
        assertArrayEquals(SORTED_ARRAY, ARRAY);
    }

    @Test
    void testSelectionSortAlgorithm() {
        SelectionSort.selectionSortAlg(ARRAY);
        assertArrayEquals(SORTED_ARRAY, ARRAY);
    }
}