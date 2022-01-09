package priv.wxl.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author xueli.wang
 * @since 2022/1/8 20:36
 */

public class OneThreeNine {
    private HashMap<String, Boolean> t = new HashMap<>();

    public static void main(String[] args) {
        OneThreeNine oneThreeNine = new OneThreeNine();
        List<String> wordDict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        System.out.println(oneThreeNine.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordDictSet = new HashSet<>(wordDict);
        return dp(s, wordDictSet);
    }

    private boolean dp(String s, HashSet<String> wordDict) {
        if (t.get(s) != null) {
            return t.get(s);
        }

        if (wordDict.contains(s)) {
            t.put(s, true);
            return true;
        }

        for (int i = 1; i < Math.min(s.length(), 20); i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i);
            if (wordDict.contains(s1) && dp(s2, wordDict)) {
                t.put(s, true);
                return true;
            }
        }

        t.put(s, false);
        return false;
    }
}
