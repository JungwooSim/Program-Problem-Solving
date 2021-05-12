/*
A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

class Solution { public int solution(int X, int[] A); }
that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.
 */
package me.study.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 문제 이해.
// 해당 값(X) 를 찾는데, 1~X 까지 모든 값이 나오면 X 값의 index를 반환
// 그렇지 않으면 -1
public class FrogRiverOne {
    public static void main(String[] args) {
        int X = 5;
        int[] A = {1,3,1,4,2,3,5,4};

//        System.out.println(remindSolution(X, A));
        System.out.println(solution(X, A));
    }

    // 체크포인트
    // 1. X 값이 있는지
    // 2. X 값을 순차적으로 찾는 도중에 X 보다 작은 모든 값이 나오는지
    public static int remindSolution(int X, int[] A){
        Set<Integer> save = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            save.add(A[i]);
            if (A[i] == X && X == save.size()) {
                return i;
            }
        }
        return -1;
    }
    public static int solution(int X, int[] A){
        boolean[] check = new boolean[X]; // X의 수만큼 false Array 생성 Ex. [false, false, false, false, false]
        int count = 0;
        for (int i=0; i < A.length; i++) {
            if (A[i] <= X) {
                if (check[A[i]-1] == false) {
                    count++;
                }
                check[A[i]-1] = true; // index는 0부터 시작하니 -1 해줌.
            }

            if (count == X) {
                return i;
            }
        }
        return -1;
    }
}
