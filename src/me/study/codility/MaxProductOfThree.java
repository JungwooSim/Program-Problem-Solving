package me.study.codility;

import java.util.Arrays;

/*
A non-empty array A consisting of N integers is given.
The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

class Solution { public int solution(int[] A); }
that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 */
public class MaxProductOfThree {
    public static void main(String[] args) {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        int[] A = {-3,1,2,-2,5,6};
        System.out.println(maxProductOfThree.solution(A));
    }

    // 경우의 수 : 모두 음수, 모두 양수, 음수+양수(혼합)
    public int solution(int[] A) {
        Arrays.sort(A);

        int length = A.length-1;

        int firstStrategy = A[length-2] * A[length-1] * A[length]; // 모두 양수, 모두 음수 (같은 식을 가지므로 한개의 식으로 퉁)
        int secondStrategy = A[0] * A[1] * A[length]; // 모두 음수

        return Math.max(firstStrategy, secondStrategy);
    }
}
