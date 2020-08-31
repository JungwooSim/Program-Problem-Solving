package me.study.leetcode;

public class ZigZagConversion {
    public static void main(String[] args) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(zigZagConversion.convert(s, numRows));
    }

    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) {
                    ret.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return ret.toString();
    }
}
