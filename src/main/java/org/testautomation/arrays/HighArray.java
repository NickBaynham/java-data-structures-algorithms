package org.testautomation.arrays;

public class HighArray {
    private final long[] internalArray;
    private int numberOfElements;
    private final int MAX_NUMBER_OF_ELEMENTS;

    public HighArray(int maxNumberOfElements) {
        MAX_NUMBER_OF_ELEMENTS = maxNumberOfElements;
        internalArray = new long[MAX_NUMBER_OF_ELEMENTS];
    }

    public int size() {
        return numberOfElements;
    }

    public boolean find(long searchKey) {
        boolean found = false;
        for (int i = 0; i < numberOfElements; i++) {
            if (internalArray[i] == searchKey) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void insert(long value) {
        internalArray[numberOfElements] = value;
        numberOfElements++;
    }

    public boolean delete(long value) {
        int index = -1;
        for (int i = 0; i < numberOfElements; i++) {
            if (internalArray[i] == value) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            for (int j = index; j < numberOfElements; j++) {
                internalArray[j] = internalArray[j + 1];
            }
        }
        numberOfElements--;
        return index > -1;
    }
}
