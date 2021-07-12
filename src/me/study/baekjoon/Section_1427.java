package me.study.baekjoon;

import java.util.Arrays;
import java.util.Collections;

/*
제목 : 소트인사이드

배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

 */
public class Section_1427 {
    public static void main(String[] args) {
        String tmpString = "2143";

        char[] tmpChar = tmpString.toCharArray();

        Integer[] tmpInt = new Integer[tmpChar.length];

        for (int i = 0; i < tmpChar.length; i++) {
            tmpInt[i] = Character.getNumericValue(tmpChar[i]);
        }
        Arrays.sort(tmpInt, Collections.reverseOrder());

        System.out.println(Arrays.toString(tmpInt));
    }
}
