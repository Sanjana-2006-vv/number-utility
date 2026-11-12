
package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        long number = sc.nextLong();

        System.out.println("Prime: " +
            NumberUtils.isPrime(number));

        System.out.println("Palindrome: " +
            NumberUtils.isPalindrome(number));

        System.out.println("Even: " +
            NumberUtils.isEven(number));

        System.out.println("Odd: " +
            NumberUtils.isOdd(number));

        sc.close();
    }
}
