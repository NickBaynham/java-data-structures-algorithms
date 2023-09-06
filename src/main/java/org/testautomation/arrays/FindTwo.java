package org.testautomation.arrays;

public class FindTwo {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 14 };
        int sum = 21;
        FindTwo findTwo = new FindTwo();
        findTwo.display(findTwo.findSum(array, sum));
    }

    int[] findSum(int[] arr, int n) {
        int[] result = null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    result = new int[]{arr[i], arr[j]};
                    break;
                }
            }
        }
        return result;
    }

    void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
