package priv.wxl.algorithm.dp;

import java.util.Arrays;

/**
 * @author xueli.wang
 * @since 2020/12/27 17:22
 */

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 10, 9, 2, 5, 3, 7, 101, 18};

        System.out.println(dp(nums));
        System.out.println(divide(nums));
    }

    private static int dp(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Integer.max(dp[i], 1 + dp[j]);
                }
            }
        }

        int res = 1;
        for (int i : dp) {
            if (i > res) {
                res = i;
            }
        }

        return res;
    }

    private static int divide(int[] nums) {
        int[] top = new int[nums.length];
        int piles = 0;
        for (int num : nums) {
            int left = 0;
            int right = piles;
            while (left < right) {
                int mid = (right + left) / 2;
                if (top[mid] > num) {
                    right = mid;
                } else if (top[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left == piles) {
                piles++;
            }

            top[left] = num;
        }

        return piles;
    }
}
