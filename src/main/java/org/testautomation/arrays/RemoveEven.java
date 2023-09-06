package org.testautomation.arrays;

import java.util.Arrays;

public class RemoveEven {
    public static void main(String[] args) {
        // Make a copy
        int[] copy = Arrays.copyOf(ints, ints.length);
        
        // Mark the deletions and count how many
        int deletions = 0;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] % 2 == 0) {
                deletions++;
            }
        }
        
        // Declare and initialize the resulting array
        int[] result = new int[copy.length - deletions];

        // Create the resulting array
        int counter = 0;
        for (int value : copy) {
            if (value % 2 != 0) {
                result[counter++] = value;
            }
        }

        // Display the result
        for (int i : result) {
            System.out.println(i);
        }
    }
    
    private static final int[] ints = { 5, 77, 23, 11, 33, 26, 94, 27, 66 };
}
