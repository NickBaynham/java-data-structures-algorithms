package org.testautomation.arrays;

public class PositiveNegative {
    public static void main(String[] args) {
        int[] arr1 = { 10, -1, 20, 4, 5, -9, -6 };

        PositiveNegative positiveNegative = new PositiveNegative();
        positiveNegative.reArrange(arr1);
        positiveNegative.display(arr1);
    }
    void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    void reArrange(int[] arr) {
        // loop until no more replacements found
        boolean replacements = true;
        while (replacements) {
            // find the rightmost negative
            int indexOfNegative = -1;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] < 0) {
                    indexOfNegative = i;
                    break;
                }
            }
            if (indexOfNegative == -1) {
                replacements = false;
            }
            // find a positive on the left to replace it with
            int indexOfPositive = -1;
            for (int i = indexOfNegative; i >= 0; i--) {
                if (arr[i] >= 0) {
                    indexOfPositive = i;
                    break;
                }
            }
            if (indexOfPositive == -1) {
                replacements = false;
            } else {
                int temp = arr[indexOfPositive];
                arr[indexOfPositive] = arr[indexOfNegative];
                arr[indexOfNegative] = temp;
            }
        }
    }
}