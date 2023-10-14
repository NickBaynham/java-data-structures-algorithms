package io.algorithms.search;

public class BinarySearch {

    private static final int[] numbers = { 1, 3, 5, 67, 72, 88, 95, 104, 144, 200 };
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int position = binarySearch.find(88);
        System.out.println(numbers[position]);
    }

    public int find(int number) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (number == numbers[mid]) {
                return mid;
            } else if (number > numbers[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
