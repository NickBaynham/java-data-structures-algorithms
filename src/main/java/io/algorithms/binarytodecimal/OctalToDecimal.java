package io.algorithms.binarytodecimal;

public class OctalToDecimal {
    public long octalToDecimal(String octalNumber) {
        long sum = 0;
        int multiplier = 1;
        for (int i = octalNumber.length() - 1; i >= 0; i--) {
            char value = octalNumber.charAt(i);
            if (value > '0' && value < '8') {
                sum += (Long.parseLong(value + "")) * multiplier;
            }
            multiplier = multiplier * 8;
        }
        return sum;
    }
}
