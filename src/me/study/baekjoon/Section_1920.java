package me.study.baekjoon;

import java.util.HashMap;
import java.util.Map;

/*
제목 : 수 찾기

N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

 */
public class Section_1920 {
    public static void main(String[] args) {
        int[] sampleValue = {4, 1, 5, 2, 3};
        int[] checkValue = {1, 3, 7, 9, 5};


        Map<Integer, Integer> tmpMap = new HashMap<>();

        for (int value : sampleValue) {
            tmpMap.put(value, 0);
        }

        for (int value : checkValue) {
            if (tmpMap.containsKey(value)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
