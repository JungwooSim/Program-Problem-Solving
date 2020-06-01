/*
A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }
that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.
 */
package me.study.codility;

import java.util.HashMap;
import java.util.Map;

public class PermCheck {
    public static void main(String[] args) {
        int[] data = {4,1,3,2};

        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(data));
    }

    public int solution(int[] A) {
        Map<Integer, Boolean> check = new HashMap<>();
        int maxValue = 0;

        for (int index=0; index < A.length; index++) {
            check.put(A[index], false);
            if (maxValue <= A[index]) {
                maxValue = A[index];
            }
        }

        for (int i = maxValue; i > 0; i-- ) {

            if (!check.containsKey(i)) {
                return 0;
            }
        }
        return 1;
    }
}
