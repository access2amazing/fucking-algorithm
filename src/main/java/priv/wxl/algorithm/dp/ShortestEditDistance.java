package priv.wxl.algorithm.dp;

import java.util.Scanner;

/**
 * @author xueli.wang
 * @since 2020/12/28 22:00
 */

public class ShortestEditDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= t.length(); i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                int flag = s.charAt(i - 1) == t.charAt(j - 1) ? 0 : 1;
                dp[i][j] = Integer.min(dp[i - 1][j] + 1,
                        Integer.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + flag));
            }
        }

        System.out.println(dp[s.length()][t.length()]);

        editDistance(s, t);
    }

    private static void editDistance(String s1, String s2) {
        int[] dp = new int[s2.length() + 1];
        for (int i = 0; i <= s2.length(); i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= s1.length(); i++) {
            int temp = dp[0];
            dp[0] = i;
            for (int j = 1; j <= s2.length(); j++) {
                int pre = temp;
                temp = dp[j];
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = pre;
                } else {
                    dp[j] = Integer.min(dp[j - 1], Integer.min(pre, dp[j])) + 1;
                }
            }
        }

        System.out.println(dp[s2.length()]);
    }
}
