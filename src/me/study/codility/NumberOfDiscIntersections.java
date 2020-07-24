package me.study.codility;
import java.util.Arrays;
/*
We draw N discs on a plane. The discs are numbered from 0 to N − 1.
An array A of N non-negative integers, specifying the radiuses of the discs, is given.
The J-th disc is drawn with its center at (J, 0) and radius A[J].

We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).

The figure below shows discs drawn for N = 6 and A as follows:

  A[0] = 1
  A[1] = 5
  A[2] = 2
  A[3] = 1
  A[4] = 4
  A[5] = 0


There are eleven (unordered) pairs of discs that intersect, namely:

discs 1 and 4 intersect, and both intersect with all the other discs;
disc 2 also intersects with discs 0 and 3.
Write a function:

class Solution { public int solution(int[] A); }
that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs.
The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

Given array A shown above, the function should return 11, as explained above.
 */
public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        int[] A = {1,5,2,1,4,0};
        System.out.println(numberOfDiscIntersections.solution(A));
    }

    public int solution(int[] A) {
        int N = A.length;

        long[] lower = new long[N];
        long[] upper = new long[N];

        for (int i=0; i < N; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int intersection = 0;
        int j = 0;

        // i 는 array의 개수
        for (int i=0; i < N; i++) {
            // j는 array의 인덱스 값
            while (j < N && upper[i] >= lower[j]) {
                intersection += j;
                intersection -= i;
                j++;
            }
        }
        if (intersection > 10000000) {
            return -1;
        }
        return intersection;
    }
}
