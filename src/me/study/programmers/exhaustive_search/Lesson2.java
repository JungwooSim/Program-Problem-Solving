package me.study.programmers.exhaustive_search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
제목 : 소수 찾기

-- 문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

-- 제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

 */
public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(solution("17"));
//        System.out.println(solution("011"));
    }

    public static int solution(String numbers) {
        char[] tochar = numbers.toCharArray();

        int numbersLength = tochar.length;

        Set<Integer> numberSet = new HashSet<>();
        for (int i = 1; i <= numbersLength; i++) {
            perm(tochar, 0, i, numberSet);
        }

        int answer = getPrimeCount(numberSet);

        return answer;
    }

    // TODO : 분석 필요
    // depth 가 재귀에서 빠져나오는 key 역할
    private static void perm(char[] array, int depth, int length, Set<Integer> numberSet) {
        // 재귀 빠져나오기 위한 조건문
        if (depth == length) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(array[i]);
            }

            int number = Integer.parseInt(sb.toString());
            if (number > 1) {
                numberSet.add(number);
            }

            return;
        }

        // 최초에 입력받은 값의 길이 만큼 loop
        for (int i = depth; i < array.length; i++) {
            swap(array, i, depth);
            perm(array, depth + 1, length, numberSet);
            swap(array, i, depth);
        }
    }

    private static void swap(char[] arrary, int i, int j) {
        char temp = arrary[i];
        arrary[i] = arrary[j];
        arrary[j] = temp;
    }

    private static int getPrimeCount(Set<Integer> numberSet) {
        int result = 0;
        for (int i : numberSet) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                ++result;
            }
        }

        return result;
    }
}
