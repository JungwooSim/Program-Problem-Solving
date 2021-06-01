package me.study.programmers.sort;

import java.util.Arrays;
import java.util.Collections;

/*
제목 : H-Index

-- 문제 설명
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

-- 제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.

 */
public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5})); // return : 3
        System.out.println(solution(new int[]{7})); // return : 1
        System.out.println(solution(new int[]{0})); // return : 0
        System.out.println(solution(new int[]{1545, 2, 999, 790, 540, 10, 22})); // return : 6
        System.out.println(solution(new int[]{1, 7, 0, 1, 6, 4})); // return : 3
        System.out.println(solution(new int[]{10, 50, 100})); // return : 3
        System.out.println(solution(new int[]{4, 3, 3, 3, 3})); // return : 3
        System.out.println(solution(new int[]{2, 7, 5})); // return : 2
        System.out.println(solution(new int[]{22, 47})); // return : 2
    }

    public static int solution(int[] citations) {
        if (citations.length == 1 && citations[0] == 0) {
            return 0;
        }

        int answer = 0;
        Arrays.sort(citations);

        int j = 0;
        for (int i = citations.length-1; i >= 0; i--) {
            if (j >= citations[i]) {
                answer = j;
                break;
            }
            j++;
        }

        if (citations.length >= 1 && answer == 0) {
            return citations.length;
        }

        return answer;
    }
}
