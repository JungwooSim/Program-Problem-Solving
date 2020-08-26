package me.study.leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = "babad";
        longestPalindromicSubstring.longestPalindrome(s);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
//                System.out.println("len : "+ len + ", start : "+ start+ ", end : "+ end);
            }
        }
//        System.out.println("start : "+ start+ ", end : "+ end);
//        System.out.println(s.substring(start, end + 1));
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
            System.out.println("left : "+ left + ", right : "+ right);
            System.out.println("L : "+ left + ", R : "+ right);
        }
        System.out.println("-------------");
        return R - L - 1;
    }
}
