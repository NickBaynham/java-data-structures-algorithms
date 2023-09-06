package org.testautomation.arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 3, 6 };
        int[] arr2 = { 4,2,1,5,0 };
        SecondMax secondMax = new SecondMax();
        System.out.println(secondMax.findSecondMaximum(arr));
        System.out.println(secondMax.findSecondMaximum(arr2));
    }

    int findSecondMaximum(int[] arr) {
        int max = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                int prevMax = max;
                max = arr[i];
                if (prevMax > secondMax) {
                    secondMax = prevMax;
                }
            }
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
