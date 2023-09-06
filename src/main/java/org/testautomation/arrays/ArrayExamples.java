package org.testautomation.arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] testArray = createArray(100);
        displayLength(createArray(100));
        for (int i = 0; i < testArray.length; i++) {
            setValueAt(testArray, i, 42);
        }
        setValueAt(testArray, 10, 99);
        System.out.println(testArray[10]);
        displayContentsOf(testArray);

        int[] another = { 0, 3, 6, 7, 41, 33, 44, 26 };
        displayContentsOf(another);

        anotherExample();
    }

    // Using an initialization list
    static int[] createArray(int size) {
        return new int[size];
    }

    static void displayLength(int[] anArray) {
        System.out.println("Array Length is: " + anArray.length);
    }

    static void displayContentsOf(int[] anArray) {
        for (int i : anArray) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    static void displayContentsOf(long[] anArray) {
        for (long i : anArray) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    static void setValueAt(int[] array, int position, int value) {
        array[position] = value;
    }

    static void anotherExample() {
        long[] array;                   // reference to an array of type long
        array = new long[100];          // create an array and assign to the reference variable
        int numberOfElements = 10;       // The number of elements in the array is zero

        // -- Assignment (Inserting 10 items) --

        array[0] = 77;
        array[1] = 26;
        array[2] = 44;
        array[3] = 21;
        array[4] = 33;
        array[5] = 26;
        array[6] = 55;
        array[7] = 99;
        array[8] = 22;
        array[9] = 3;

        displayContentsOf(array);
        System.out.println("Item 26 is at position: " + findItem(array, 26));
        System.out.println("Item 42 is at position: " + findItem(array, 42));
    }

    /***
     *
     * @param array is the array to search
     * @param value is the value to find
     * @return array element containing the first found value or if not found return -1
     */
    static int findItem(long[] array, long value) {
        int returnValue = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                returnValue = i;
                break;
            }
        }
        return returnValue;
    }
}
