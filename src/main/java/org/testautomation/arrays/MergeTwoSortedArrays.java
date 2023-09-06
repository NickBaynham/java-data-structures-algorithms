package org.testautomation.arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        mergeTwoSortedArrays.display(mergeTwoSortedArrays.mergeArrays(ARRAY_1, ARRAY_2));
    }

    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (index1 >= array1.length) {
                result[i] = array2[index2++];
            } else if (index2 >= array2.length) {
                result[i] = array1[index1++];
            } else if (array1[index1] < array2[index2]) {
                result[i] = array1[index1++];
            } else {
                result[i] = array2[index2++];
            }
        }
        return result;
    }

    public void display(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    private static final int[] ARRAY_1 = { 1, 3, 4, 5 };
    private static final int[] ARRAY_2 = { 2, 6, 7, 8 };
}
