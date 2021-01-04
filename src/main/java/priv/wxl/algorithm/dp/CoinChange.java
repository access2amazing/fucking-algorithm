package priv.wxl.algorithm.dp;

import java.util.Scanner;

/**
 * @author xueli.wang
 * @since 2020/12/27 09:35
 */

public class CoinChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        int amount = scanner.nextInt();

        System.out.println(coinChange(coins, amount));
    }

    private static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }

                dp[i] = Integer.min(dp[i], 1 + dp[i - coin]);
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
