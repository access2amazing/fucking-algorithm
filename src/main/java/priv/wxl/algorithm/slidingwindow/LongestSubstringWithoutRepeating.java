package priv.wxl.algorithm.slidingwindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xueli.wang
 * @since 2020/12/27 15:09
 */

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int left = 0;
        int right = 0;
        int res = 0;
        Map<String, Integer> window = new HashMap<>();
        while (right < s.length()) {
            String s1 = String.valueOf(s.charAt(right));
            window.put(s1, window.getOrDefault(s1, 0) + 1);
            right++;
            while (window.get(s1) > 1) {
                String s2 = String.valueOf(s.charAt(left));
                window.put(s2, window.get(s2) - 1);
                left++;
            }
            res = Integer.max(res, right - left);
        }

        System.out.println(res);
    }
}
