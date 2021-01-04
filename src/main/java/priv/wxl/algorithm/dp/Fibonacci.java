package priv.wxl.algorithm.dp;

import java.util.Scanner;

/**
 * @author xueli.wang
 * @since 2020/12/25 21:29
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
        System.out.println(fib1(n));
        System.out.println(fib2(n));
    }

    private static int fib1(int n) {
        if (n < 1) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    private static int fib2(int n) {
        if (n < 1) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int prev = 1;
        int curr = 1;

        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }

        return curr;
    }

    private static int fib(int n) {
        if (n < 1) {
            return 0;
        }

        int[] memory = new int[n + 1];

        return helper(memory, n);
    }

    private static int helper(int[] memory, int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }

        memory[n] = helper(memory, n - 1) + helper(memory, n - 2);
        return memory[n];
    }
}
