package io.algoexpert.easy;

import java.util.HashMap;

public class NthFibonacci {

    public HashMap<Integer, Integer> map = new HashMap<>();

    public int fibonacci(int N) {
        if (N == 1) {
            return 0;
        }
        if (N == 2) {
            return 1;
        }
        if (!map.containsKey(N)) {
            map.put(N, fibonacci(N - 1) + fibonacci(N - 2));
        }
        return map.get(N);
    }

    public int fibonacciIterative(int N) {
        int a = 0;
        int b = 1;
        int count = 1;
        while (count < N) {
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        return a;
    }

    public static void main(String[] args) {
        int N = 10;
        NthFibonacci fibo = new NthFibonacci();
        System.out.println("Nth Fibonacci for " + N + " is: " + fibo.fibonacciIterative(N));
    }
}
