package me.study.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters LSWRC = new LongestSubstringWithoutRepeatingCharacters();

        String s = "abcabcbb";

        System.out.println(LSWRC.lengthOfLongestSubstring(s));

    }

    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
