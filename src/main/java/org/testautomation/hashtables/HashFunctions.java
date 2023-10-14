package org.testautomation.hashtables;

public class HashFunctions {
    public static void main(String[] args) {
        int [] list = new int[10];
        int key = 35;
        int index = hashModular(key, 10);
        System.out.println("The index for key " + key + " is " + index);
    }

    public static int hashModular(int key, int size) {
        return key % size;
    }
}
