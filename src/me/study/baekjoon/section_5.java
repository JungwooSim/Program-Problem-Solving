package me.study.baekjoon;

import java.util.HashMap;

public class section_5 {
    public static void main(String[] args) {
        String str_1 = "41523";
        String str_2 = "13795";

        HashMap<Character, Integer> number_1 = new HashMap<>();

        for (char value : str_1.toCharArray()) {
            number_1.put(value, 0);
        }

        for (char value : str_2.toCharArray()) {
            System.out.println(number_1.containsKey(value) ? 1 : 0);
        }
    }
}
