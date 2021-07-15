package me.study.baekjoon;

/*
제목 : Z
link : https://www.acmicpc.net/problem/1074
 */
public class Section_1074 {
    static int result = 0;
    static int searchX;
    static int searchY;
    public static void main(String[] args) {
        int n = 2;
        searchX = 3;
        searchY = 1;

        fun((int) Math.pow(2, n), 0, 0);
    }

    public static void fun(int n, int x, int y) {
        if (n == 2) {
            if (x == searchX && y == searchY) {
                System.out.println(result);
            }
            result++;

            if (x == searchX && y + 1 == searchY) {
                System.out.println(result);
            }
            result++;

            if (x + 1 == searchX && y == searchY) {
                System.out.println(result);
            }
            result++;

            if (x + 1 == searchX && y + 1 == searchY) {
                System.out.println(result);
            }
            result++;

            return;
        }

        fun(n / 2, x, y);
        fun(n / 2, x, y + n / 2);
        fun(n / 2, x + n / 2, y);
        fun(n / 2, x + n / 2, y + n / 2);
    }
}
