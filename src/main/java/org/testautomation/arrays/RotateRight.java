package org.testautomation.arrays;

public class RotateRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        RotateRight rotateRight = new RotateRight();
        rotateRight.display(rotateRight.rotateArray(arr));
    }

    int[] rotateArray(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
