/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
 */
package me.study.codility;

public class PermMissingElem {
    public int solution(int[] A){
        int totalSum = 0;
        int dataSum = 0;
        for (int i=0; i<A.length; i++) {
            dataSum += A[i];
            totalSum += i + 1;
        }
        totalSum += A.length+1;
        return totalSum - dataSum;
    }
}
