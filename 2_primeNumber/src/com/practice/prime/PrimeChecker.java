package com.practice.prime;

import java.util.Scanner;

public class PrimeChecker {

    // 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
    static long[] divisors = {2, 3, 5, 7, 11, 13, 17};

    static boolean prime(long number) {

        boolean result = true;
        if (number > 1 && number < 4) {
            result = true;
        } else if (number < 2) {
            result = false;
        } else {
            for (int i = 0; i < divisors.length; i++) {
                if (number % divisors[i] == 0) {
                    result = false;
                    break;
                }
            }
            for (long j = divisors[divisors.length - 1]; j < number / 2; j = j + 2) {
                if (number % j == 0) {
                    System.out.println("Evenly divisible by: " + j);
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Enter number to see if it's prime or not: ");
        long number = new Scanner(System.in).nextLong();

        System.out.print(number + " is ");
        System.out.print(prime(number) ? "prime!" : "NOT prime");
    }
}
