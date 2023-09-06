package org.testautomation.arrays;

public class FindFirstNonRepeat {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 3, 2, 6, 6};
        int[] test2 = {4,4,4,3};
        int[] test3 = {4,5,1,2,0,4};
        FindFirstNonRepeat findFirstNonRepeat = new FindFirstNonRepeat();
        System.out.println(findFirstNonRepeat.findFirstUnique(arr));
        System.out.println(findFirstNonRepeat.findFirstUnique(test2));
        System.out.println(findFirstNonRepeat.findFirstUnique(test3));
    }

    int findFirstUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue; // should not match an element to itself
                } else if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return arr[i];
            }
        }
        return -1;
    }
}
