package io.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SelectionSortTest {
    @Test
    void testSelectionSort() {
        Integer[] testData = { 1, 5, 2, 3, 4, 6, 9, 8 };
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.sort(testData);
        assertThat(testData).isSorted();
        selectionSort.print(testData);
    }
}
