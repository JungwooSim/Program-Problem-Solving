package me.study.codility;

/*
A non-empty array A consisting of N integers is given.
A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements).
The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice.
To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).

For example, array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
contains the following example slices:

slice (1, 2), whose average is (2 + 2) / 2 = 2;
slice (3, 4), whose average is (5 + 1) / 2 = 3;
slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
The goal is to find the starting position of a slice whose average is minimal.

Write a function:

class Solution { public int solution(int[] A); }
that, given a non-empty array A consisting of N integers, returns the starting position of the slice with the minimal average.
If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.

For example, given array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
the function should return 1, as explained above.

* 전략
- 평균의 특징을 이용하여 비교 대상을 한정 시킨다.(모든 조합을 이용하지 않아 O(N)으로 가능하다)
- 평균의 특징 : 두 수의 평균은 두 수 중 작은 수보다 크다. Ex. (1,2) = 1.5
- 그러므로 예를 들어, (1,2,3,4)의 최소 평균값을 구할때 2개의 원소의 평균과 3개 원소의 평균을 구하면 최소 평균값을 가지는 원소를 구할 수 있다.
 */
public class MinAvgTwoSlice {
    public static void main(String[] args) {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        int[] A = {4, 2, 2, 5, 1, 5, 8};

        System.out.println(minAvgTwoSlice.solution(A));
    }

    public int solution(int [] A) {
        float minValue = (A[0] + A[1]) / 2f;
        int minIndex = 0;

        for (int i = 2; i < A.length; i++) {
            float avg = (A[i-1] + A[i-0]) / 2f;
            if (minValue > avg) {
                minValue = avg;
                minIndex = i-1;
            }

            avg = (A[i-2] + A[i-1] + A[i]) / 3f;
            if (minValue > (A[i-2] + A[i-1] + A[i]) / 3f) {
                minValue = avg;
                minIndex = i-2;
            }
        }

        return minIndex;
    }
}
