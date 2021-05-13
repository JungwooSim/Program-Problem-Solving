/*
MaxCounters

You are given N counters, initially set to 0, and you have two possible operations on them:

increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty array A of M integers is given. This array represents consecutive operations:

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.

Write a function:

class Solution { public int[] solution(int N, int[] A); }
that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.

Result array should be returned as an array of integers.

For example, given:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.
 */
package me.study.codility;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        MaxCounters maxCounters = new MaxCounters();

        int N = 5;
        int[] A = {3,4,4,6,1,4,4};

        remindSolution(N, A);

//        System.out.println(Arrays.toString(maxCounters.solution(N, A)));
    }

    // A array 의 element 를 key 로 사용하는 전략. (이중 포문 사용하지 않도록)
    // 이방법은 퍼포먼스가 안나옴.
    public static int[] remindSolution(int N, int[] A){
        int[] count = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            int index = A[i]-1;

            // N 이상일때. (모든 값을 max 값으로)
            if (index >= N) {
                for (int j = 0; j < count.length; j++) {
                    count[j] = max;
                }
            } else {
                count[index]++;
                if (max < count[index]) {
                    max = count[index];
                }
            }
        }

        return count;
    }

    public int[] solution(int N, int[] A){
        int[] count = new int[N];
        int maxValue = 0;
        int tmpMaxValue = 0;

        for (int index=0; index < A.length; index++) {

            // 범위 밖일때 maxValue 설정
            if (A[index] > N) {
                maxValue = tmpMaxValue;
            } else {
                // 어떠한 값이든 무조건 maxValue 이상이 되기 때문에 설정해주는 코드
                if (count[A[index] - 1] < maxValue) {
                    count[A[index] - 1] = maxValue;
                }
                count[A[index]-1]++;

                // count Array 의 가장 큰 값을 항상 가지고 있기 위한 코드.
                if (count[A[index] - 1] > tmpMaxValue) {
                    tmpMaxValue = count[A[index] - 1];
                }
            }
        }

        // 위 loop 에서 해결하지 못한 값들 설정
        if (maxValue > 0) {
            for (int index=0; index < count.length; index++) {
                if (count[index] < maxValue) {
                    count[index] = maxValue;
                }
            }
        }
        return count;
    }
}

























