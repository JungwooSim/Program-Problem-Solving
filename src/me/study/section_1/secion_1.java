package me.study.section_1;

import java.util.Scanner;

/*
* 문제
코이 초등학교에 새로 부임하신 교장 선생님은 어린 학생들의 행복감과 학생들의 성적 차이 관계를 알아보기로 했다. 그래서 이전 성적을 조사하여 학생 들의 시험 점수 차이 변화를 알아보려고 한다.
예를 들어서 2016년 학생 8명의 점수가 다음과 같다고 하자.
- 27, 35, 92, 75, 42, 53, 29, 87
그러면 가장 높은 점수는 92점이고 가장 낮은 점수는 27점이므로 점수의 최대 차이는 65이다. 한편 2017년 학생 8명의 점수가 다음과 같았다.
- 85, 42, 79, 95, 37, 11, 72, 32
이때 가장 높은 점수는 95점이고 가장 낮은 점수는 11점이므로 점수의 최대 차이는 84이다.
N명 학생들의 점수가 주어졌을 때, 가장 높은 점수와 가장 낮은 점수의 차이를 구하는 프로그램을 작성하시오

* 입
표준 출력으로 가장 높은 점수와 가장 낮은 점수의 차이를 출력한다.

* 제한
표준 출력으로 가장 높은 점수와 가장 낮은 점수의 차이를 출력한다.

 */
public class secion_1 {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[1000];

        int student = scanner.nextInt();

        int min = 1000;
        int max = 0;

        for (int i = 0 ; i < student; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < student; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(max - min);
    }
}
