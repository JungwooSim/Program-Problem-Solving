package me.study.baekjoon;

import java.util.Arrays;

/*
제목 : 수 정렬하기

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

 */
public class Section_2750 {
    public static void main(String[] args) {
        int[] value = {5,2,3,4,1};

        Arrays.sort(value);

        System.out.println(Arrays.toString(value));
    }
}
