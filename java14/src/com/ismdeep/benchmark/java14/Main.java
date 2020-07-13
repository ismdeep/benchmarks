package com.ismdeep.benchmark.java14;

import com.ismdeep.utils.UnixTimeUtil;
import com.ismdeep.benchmark.java14.benckmarkitems.Fibonacci;


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 45; i++) {
            long start_time = UnixTimeUtil.unix_timestamp_ms();
            int fib_val = Fibonacci.fibonacci(i);
            long end_time = UnixTimeUtil.unix_timestamp_ms();
            System.out.println(String.format("fib,java14,%d,%d", i, end_time - start_time));
        }
    }
}
