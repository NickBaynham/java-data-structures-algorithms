package io.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BubbleSortTest {
    @Test
    void testBubbleSort() {
        Integer[] testData = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
        new BubbleSort<Integer>().sort(testData);
        assertThat(testData).isSorted();
    }
}
