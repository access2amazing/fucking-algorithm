package priv.wxl.algorithm.slidingwindow;

import javax.management.StringValueExp;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xueli.wang
 * @since 2020/12/27 13:33
 */

public class MinWindowSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int left = 0;
        int right = 0;

        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            String c = String.valueOf(t.charAt(i));
            target.put(c, target.getOrDefault(c, 0) + 1);
        }


        int match = 0;
        Map<String, Integer> window = new HashMap<>();

        int start = 0;
        int minLen = Integer.MAX_VALUE;
        while (right < s.length()) {
            String c = String.valueOf(s.charAt(right));
            if (target.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(target.get(c))) {
                    match++;
                }
            }
            right++;

            while (match == target.size()) {
                if ((right - left) < minLen) {
                    start = left;
                    minLen = right - left;
                }

                String ch = String.valueOf(s.charAt(left));
                if (target.containsKey(ch)) {
                    window.put(ch, window.get(ch) - 1);
                    if (window.get(ch) < target.get(ch)) {
                        match--;
                    }
                }
                left++;
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen));
    }
}
