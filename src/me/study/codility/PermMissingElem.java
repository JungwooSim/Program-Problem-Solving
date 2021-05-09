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
    public static void main(String[] args) {
        int[] A = {2,3,1,5};

        System.out.println(remindSolution(A));
    }

    // 문제를 보면 빈 값을 찾는 것인데, 항상 1개가 비게 되니까 우리는 [1..(N + 1)] 공식을 통해 전체 값의 합을 구할 수 있다.
    // 그리고 현재 array 에 포함된 값들의 합을 계산할 수 있다.
    // 각각 계산 후 마이너스 하게되면 missing 된 값을 알 수 있다.
    public static int remindSolution(int[] A){
        int totalSum = 0;
        int arraySum = 0;

        for (int i = 0; i < A.length; i++) {
            totalSum += 1 + i; // [1..(N + 1)] 1부터 시작.
            arraySum += A[i];
        }
        totalSum += A.length + 1; // [1..(N + 1)] 에서 (N + 1) 이므로 한번더 더해줌

        return totalSum-arraySum;
    }

    public static int solution(int[] A){
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
