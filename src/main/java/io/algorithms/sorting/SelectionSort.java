package io.algorithms.sorting;

/***
 * Simple, but not performant
 */
public class SelectionSort<T extends Comparable<T>> {
    public void sort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i].compareTo(data[j]) > 0) {
                    swap(data, i, j);
                }
            }
        }
    }

    public void swap(T[] list, int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    /***
     * Print the list
     * @param listToSort - The list of items as an array
     */
    public void print(T[] listToSort) {
        for (T item : listToSort) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }
}
