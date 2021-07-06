package me.study.baekjoon;

/*
제목 : 음계

다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

 */
public class Section_2920 {
    public static void main(String[] args) {
        int[] sampleInput_1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] sampleInput_2 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] sampleInput_3 = {8, 1, 7, 2, 6, 3, 5, 4};

        System.out.println(go(sampleInput_1));
        System.out.println(go(sampleInput_2));
        System.out.println(go(sampleInput_3));
    }

    public static String go(int[] example) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < example.length-1; i++) {
            if (example[i] < example[i+1]) {
                descending = false;
            }

            if (example[i] > example[i+1]) {
                ascending = false;
            }
        }

        if (ascending) {
            return "ascending";
        }

        if (descending) {
            return "descending";
        }

        return "mixed";
    }
}
