package com.practice.fibonacci;

public class Fibonacci {

    public static void displaySeries(int numberOfNumbersToDisplay) {

        int n = 1;
        int nPlusOne = 1;

        if (numberOfNumbersToDisplay >= 1) {
            System.out.print(n);
        }
        if (numberOfNumbersToDisplay >= 2) {
            System.out.print(", ");
            System.out.print(nPlusOne);
        }
        for (int i = 0; i < numberOfNumbersToDisplay - 2; i++) {
            int next = n + nPlusOne;
            System.out.print(", ");
            System.out.print(next);
            n = nPlusOne;
            nPlusOne = next;
        }
    }

    public static void main(String[] args) {
        Fibonacci.displaySeries(Integer.parseInt(args[0]));
    }
}
