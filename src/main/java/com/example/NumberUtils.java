
package com.example;

public class NumberUtils {

    public static boolean isPrime(long number) {

        if (number <= 1) {
            return false;
        }

        for (long i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(long number) {

        if (number < 0) {
            return false;
        }

        String original = String.valueOf(number);

        String reversed =
            new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }

    public static boolean isEven(long number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(long number) {
        return number % 2 != 0;
    }
}
