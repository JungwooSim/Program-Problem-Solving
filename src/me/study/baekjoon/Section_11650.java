package me.study.baekjoon;

import java.util.Arrays;

/*
제목 : 좌표 정렬하기

2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

 */
public class Section_11650 {
    public static void main(String[] args) {
        int[][] tmpValue = new int[5][2];

        tmpValue[0][0] = 3; tmpValue[0][1] = 4;
        tmpValue[1][0] = 1; tmpValue[1][1] = 1;
        tmpValue[2][0] = 1; tmpValue[2][1] = -1;
        tmpValue[3][0] = 2; tmpValue[3][1] = 2;
        tmpValue[4][0] = 3; tmpValue[4][1] = 3;

        for (int[] value : tmpValue) {
            System.out.println(Arrays.toString(value));
        }

        Arrays.sort(tmpValue, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];

            } else {
                return a[0] - b[0];
            }
        });

        System.out.println("-- before --");
        for (int[] value : tmpValue) {
            System.out.println(Arrays.toString(value));
        }
    }
}
