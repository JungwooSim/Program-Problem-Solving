package me.study.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(121);
        System.out.println(result);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverted = 0;
        int remainder = 0;
        int original = x;

        while (x > 0) {
            remainder = x % 10;
            reverted = reverted * 10 + remainder;
            x = x / 10;
        }

        return original == reverted;
    }
}
