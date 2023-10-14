package io.algorithms.binarytodecimal;

public class BinaryToDecimal {
    public int binaryToDecimal(String binaryNumber) {
        int incrementor = 1;
        int sum = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char bit = binaryNumber.charAt(i);
            int value = 0;
            if (bit == '1') {
                value = incrementor;
            }
            incrementor = incrementor * 2;
            sum += value;
        }
        return sum;
    }
}