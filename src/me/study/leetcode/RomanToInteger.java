package me.study.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();

        System.out.println(romanToInteger.romanToInt("III"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int romanNum = 0;
        int afterNum = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            romanNum = roman.get(s.charAt(i));
            if (afterNum != 0 && afterNum < romanNum) {
                result += romanNum - afterNum - afterNum;
            } else {
                result += romanNum;
            }
            afterNum = roman.get(s.charAt(i));
        }

        return result;
    }
}
