package io.algorithms.sorting;

public class BubbleSort<T extends Comparable<T>> {
    public void sort(T[] data) {
        boolean swaps = true;
        while (swaps) {
            swaps = false;
            for (int i = data.length - 1; i > 0; i--) {
                if (data[i - 1].compareTo(data[i]) > 0) {
                    swap(data, i, i - 1);
                    swaps = true;
                }
            }
            print(data);
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