package org.testautomation.arrays;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 3, 6 };
        FindMinimum findMinimum = new FindMinimum();
        System.out.println(findMinimum.findMinimum(arr));
    }

    int findMinimum(int[] arr) {
        int minimum = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }
}
