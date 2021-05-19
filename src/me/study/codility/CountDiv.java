/*
Write a function:

class Solution { public int solution(int A, int B, int K); }
that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }
For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 */

package me.study.codility;

public class CountDiv {
    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(6, 11, 2));;
    }

    public int solution(int A, int B, int K) {
        if (A == 0) {
            return B / K + 1;
        } else {
            return (B / K) - (A - 1) / K; // 0 ~ B 에 K의 값이 나오는 숫자 - (A-1 , A의 자신을 빼기 위해 -1 ) 에서 K 값이 나오는 숫자
        }
    }
}
