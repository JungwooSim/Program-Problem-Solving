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

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        int[] data = {4,1,3,2};

        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(data));
    }

    public int solution(int[] A) {
        Set<Integer> data = new HashSet<>();

        // 순열이 되는 조건 2가지가 있으므로 해당 조건을 확인하는 방법
        for (int i=0; i < A.length; i++) {
            if (A[i] > A.length) {
                return 0;
            }

            if (data.contains(A[i])) {
                return 0;
            }
            data.add(A[i]);
        }
        return 1;
    }
}
