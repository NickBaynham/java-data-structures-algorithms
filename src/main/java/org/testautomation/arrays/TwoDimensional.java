package org.testautomation.arrays;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] twoDim = new int[3][3];
        twoDim[0][0] = 42;


        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[0].length; j++) {
                System.out.println("Array element [" + i + "][" + j + "] has value of " + twoDim[i][j]);
            }
        }

        System.out.println("-------------------------------------");

        int[][] example2 = { {1, 2, 3}, {4, 4, 99}};
        for (int i = 0; i < example2.length; i++) {
            for (int j = 0; j < example2[i].length; j++) {
                System.out.println("Array element [" + i + "][" + j + "] has value of " + example2[i][j]);
            }
        }

    }
}
