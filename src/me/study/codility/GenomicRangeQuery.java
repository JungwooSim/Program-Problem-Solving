package me.study.codility;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).

For example, consider string S = CAGCCTA and arrays P, Q such that:

    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
The answers to these M = 3 queries are as follows:

The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
Write a function:

class Solution { public int[] solution(String S, int[] P, int[] Q); }
that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.

Result array should be returned as an array of integers.

For example, given the string S = CAGCCTA and arrays P, Q such that:

    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
the function should return the values [2, 4, 1], as explained above.

------
* 전략
- 특정 구간에서 변경된게 있는지 확인하는게 중요
1. 문자열을 반복문을 통해 특정 구간에서 변경되는게 있는지 확인하는 배열을 생성
2. 해당 배열을 가지고 약간의 if 를 통해 값을 설정

이렇게 하면 최소한의 반복문으로 결과를 도출할 수 있다. (O(M+N))
 */
public class GenomicRangeQuery {
    public static void main(String[] args) {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};

        for (int i = 0; i < genomicRangeQuery.solution(S, P, Q).length; i++) {
            System.out.println(genomicRangeQuery.solution(S, P, Q)[i]);
        }

    }
    public int[] solution(String S, int[] P, int[] Q) {
        // A, C, G, T
        int[] A = new int[S.length()+1];
        int[] C = new int[S.length()+1];
        int[] G = new int[S.length()+1];

        int[] returnVal = new int[P.length];
        char[] charOfS = S.toCharArray();

        for (int i = 0; i < charOfS.length; i++ ) {
            switch (charOfS[i]) {
                case 'A' :
                    A[i+1]++;
                    break;
                case 'C' :
                    C[i+1]++;
                    break;
                case 'G' :
                    G[i+1]++;
                    break;
                default : break;
            }
            A[i+1] += A[i];
            C[i+1] += C[i];
            G[i+1] += G[i];
        }

        for (int i = 0; i < returnVal.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i];

            if (startIndex == endIndex) {
                char x = charOfS[startIndex];

                switch (x) {
                    case 'A' :
                        returnVal[i] = 1;
                        break;
                    case 'C' :
                        returnVal[i] = 2;
                        break;
                    case 'G' :
                        returnVal[i] = 3;
                        break;
                    default :
                        returnVal[i] = 4;
                        break;
                }
            } else if (A[startIndex] != A[endIndex+1]) {
                returnVal[i] = 1;
            } else if (C[startIndex] != C[endIndex+1]) {
                returnVal[i] = 2;
            } else if (G[startIndex] != G[endIndex+1]) {
                returnVal[i] = 3;
            } else {
                returnVal[i] = 4;
            }
        }

        return returnVal;
    }
}
