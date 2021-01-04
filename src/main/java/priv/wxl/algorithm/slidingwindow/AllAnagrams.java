package priv.wxl.algorithm.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xueli.wang
 * @since 2020/12/27 14:27
 */

public class AllAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            target.put(s1, target.getOrDefault(s1, 0) + 1);
        }

        int match = 0;
        Map<String, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;

        List<Integer> res = new ArrayList<>();
        while (right < s.length()) {
            String s1 = String.valueOf(s.charAt(right));
            if (target.containsKey(s1)) {
                window.put(s1, window.getOrDefault(s1, 0) + 1);
                if (window.get(s1).equals(target.get(s1))) {
                    match++;
                }
            }
            right++;

            while (match == target.size()) {
                if ((right - left) == t.length()) {
                    res.add(left);
                }

                String s2 = String.valueOf(s.charAt(left));
                if (target.containsKey(s2)) {
                    window.put(s2, window.get(s2) - 1);
                    if (window.get(s2) < target.get(s2)) {
                        match--;
                    }
                }
                left++;
            }
        }

        System.out.println(res);
    }
}
