package me.study.baekjoon;

public class section_4 {
    public static void main(String[] args) {

        String TrueAndFalse = "XOOOXOOX";

        int bonus = 0;
        int point = 0;
        for (int index = 0; index < TrueAndFalse.length(); index++) {
            if (TrueAndFalse.charAt(index) == 'X') {
                bonus = 0;
            } else {
                point = point + (index + 1) + bonus;
                bonus++;
            }
        }

        System.out.println(point);
    }
}
