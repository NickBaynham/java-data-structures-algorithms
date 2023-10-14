package test.lib.dsa.queue;

import io.algorithms.sorting.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InsertionSortTest {
    @Test
    void testInsertionSort() {
        Integer[] testData = { 9, 4, 3, 8, 6, 1, 10, 2, 7, 5 };
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(testData);
        assertThat(testData).isSorted();
    }
}
