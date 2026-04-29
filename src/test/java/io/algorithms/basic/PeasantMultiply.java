package io.algorithms.basic;
import java.lang.Math;

public class PeasantMultiply {

    public static int peasantMultiply(int x, int y) {
        int prod = 0;
        while (x > 0) {
            if (x % 2 == 1) {
                prod += y;
            }

            x = Math.floorDiv(x, 2);
            y += y;
        }

        return prod;
    }

    public static void main(String[] args) {
        int x = 7;
        int y = 9;
        int prod = peasantMultiply(x, y);
        System.out.println(x + " * " + y + " = " + prod);
    }
}