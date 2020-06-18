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

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
//        int[] data = {1, 3, 6, 4, 1, 2};
        int[] data = {1,2,3};
//        int[] data = {-1, -3};

        MissingInteger missingInteger = new MissingInteger();
        System.out.println(missingInteger.solution(data));
    }

    public int solution(int[] A) {
        Set<Integer> data = new HashSet<>();

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
