package com.ismdeep.benchmark.java14.benckmarkitems;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
