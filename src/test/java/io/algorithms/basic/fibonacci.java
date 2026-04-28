package io.algorithms.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class fibonacci {
    public static ArrayList<Integer>fibonacciMultiply(ArrayList<Integer> X, ArrayList<Integer> Y) {
        if (X == null || Y == null) {
            return new ArrayList<Integer>();
        }

        if (X.size() == 0 || Y.size() == 0) {
            return new ArrayList<Integer>();
        }

        int m = X.size();
        int n = Y.size();
        ArrayList<Integer> Z = new ArrayList<Integer>(Collections.nCopies(m + n, 0));
        int hold = 0;
        for (int k = 0; k < n + m - 1; k++) {
            for (int i = 0; i < m; i++) {
                int j = k - i;
                if (j >= 0 && j < n && i + j == k) {
                    hold += X.get(i) * Y.get(j);
                }
            }
            Z.set(k, hold % 10);
            hold /= 10;
        }
        Z.set(m + n - 1, hold);
        while (Z.size() > 1 && Z.get(Z.size()-1) == 0) {
            Z.remove(Z.size()-1);
        }
        Collections.reverse(Z);
        return Z;
    }

    public static void main(String[] args) {
        ArrayList<Integer> X = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> Y = new ArrayList<Integer>(Arrays.asList(4, 5));
        ArrayList<Integer> Z = fibonacciMultiply(X, Y);
        System.out.print("The product of two input vectors is: ");
        for (int i = 0; i < Z.size(); i++) {
            System.out.print(Z.get(i));
        }
        System.out.println();
    }
}
