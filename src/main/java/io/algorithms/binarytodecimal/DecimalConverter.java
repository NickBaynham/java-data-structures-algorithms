package io.algorithms.binarytodecimal;

public class DecimalConverter {
    public long convert(String number, int base) {
        long sum = 0;
        long multiplier = 1;
        for (int i = number.length() - 1; i >= 0; i--) {
            char nextChar = number.charAt(i);
            if (nextChar > '0' && nextChar < Character.forDigit(base, base)) {
                sum = Long.parseLong(Character.forDigit(nextChar, base) + "") * multiplier;
            }
            multiplier *= base;
        }
        return sum;
    }

    public static void main(String[] args) {
        DecimalConverter decimalConverter = new DecimalConverter();
        System.out.println(decimalConverter.convert("010101", 2));
        System.out.println(decimalConverter.convert("07423", 8));
        System.out.println(decimalConverter.convert("591", 10));
    }
}
