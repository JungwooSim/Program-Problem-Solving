package me.study.me;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        int[] a = {1,2,3};

        String s = "abcdedcba";
        System.out.println(palindrome.palindrom(s));
    }

    public boolean palindrom(String s) {
        boolean result = true;
        for (int i=0; i < s.length() / 2; i++) {
            int j = s.length() - 1 - i;

            if (s.charAt(i) != s.charAt(j)) {
                result = false;
            }
        }
        return result;
    }
}
