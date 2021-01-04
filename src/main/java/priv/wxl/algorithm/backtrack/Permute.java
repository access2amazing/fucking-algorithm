package priv.wxl.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xueli.wang
 * @since 2020/12/27 10:20
 */

public class Permute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        backtrack(nums, new LinkedList<>());
    }

    private static void backtrack(int[] nums, LinkedList<Integer> track) {
        if (track.size() ==  nums.length) {
            // 触发结束条件
            System.out.println(track);
            return;
        }

        for (int num : nums) {
            if (track.contains(num)) {
                // 排除不合法的选择
                continue;
            }

            // 做选择
            track.add(num);
            // 进入下一层决策树
            backtrack(nums, track);
            // 取消选择
            track.removeLast();
        }
    }
}
