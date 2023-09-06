package org.testautomation.arrays;

public class ProductsExcept {
    public static void main(String[] args) {
        int[] input1 = { 1, 2, 3, 4 };
        int[] input2 = { 4, 2, 1, 5, 0 };
        ProductsExcept productsExcept = new ProductsExcept();
        productsExcept.display(productsExcept.findProduct(input1));
        productsExcept.display(productsExcept.findProduct(input2));
    }

    void display(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    int[] findProduct(int[] arr) {
        int[] products = new int[arr.length];
        for (int i = 0; i < products.length; i++) {
            int product = 1;
            for (int j = 0; j < products.length; j++) {
                if (j != i) {
                    product *= arr[j];
                }
            }
            products[i] = product;
        }
        return products;
    }
}
