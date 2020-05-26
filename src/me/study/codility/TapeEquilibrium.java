/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }
that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

N : 5
if P = 1
A[0] - A[1] + A[1+1]+ A[1+2] + A[1+3] | 3 - (1 + 2 + 4 + 3)

if P = 2
A[0] + A[1] - A[2] + A[2+1] + A[2+2] | 3 + 1 - (2 + 4 + 3)

if P = 3
A[0] + A[1] + A[2] - A[3] + A[3+1] | 3 + 1 + 2 - (4 + 3)

if P = 4
A[0] + A[1] + A[2] + A[3] - A[4] | 3 + 1 + 2 + 4 - (3)

3을 뺏을 때 남은 값
4를 추가로 뺏을때 남은 값
2를 추가로 뺏을 때 남은 값
1을 추가로 뺏을 때 남은 값
 */
package me.study.codility;

public class TapeEquilibrium {

    public int solution(int[] A) {
        int totalSum = 0;
        int[] N = new int[A.length-1];
        for (int index = 0; index < A.length-1; index++) {
            totalSum += A[index];
            N[index] = totalSum;
        }

        int pSum = 0;
        int[] P = new int[A.length-1];
        for (int index = A.length-1; index > 0; index--) {
            pSum += A[index];
            P[index-1] = pSum;
        }

        int minValue = 0;
        for (int index = 0; index < A.length-1; index++) {
            int value = Math.abs(N[index] - P[index]);

            if (index == 0) {
                minValue = value;
            }

            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }

}
