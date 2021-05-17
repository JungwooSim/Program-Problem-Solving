/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.
 */
package me.study.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{-1, -3}));
    }
    // 연속이 끊길때 해당 값
    // 연속적이면, 다음 숫자
    public static int solution(int[] A) {
        Set<Integer> data = new HashSet<>(); // 중복을 허용하지 않으며, 값들은 정렬되어 보관됨.

        for (int value : A) {
            data.add(value);
        }

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!data.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
