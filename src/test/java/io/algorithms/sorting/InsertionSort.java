package io.algorithms.sorting;

public class InsertionSort<T extends Comparable<T>> {
    public void sort(T[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (data[j].compareTo(data[j - 1]) < 0) {
                    swap(data, j, j - 1);
                } else {
                    break;
                }
                print(data);
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
