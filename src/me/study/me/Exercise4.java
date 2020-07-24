package me.study.me;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise4 {
    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();

//        int[] A = {1,3,2,1};
//        int[] B = {4,2,5,3,2};

        int[] A = {2,1};
        int[] B = {3,3};

        System.out.println(exercise4.solution(A,B));
    }

    public int solution(int[] A, int[] B) {
        HashSet axis = new HashSet<>();

        // O(1)
        for (int i=0; i<A.length; i++) {
            axis.add(A[i]);
        }

        // O(N)
        Arrays.sort(B);

        // O(N)
        for (int i = 0; i< B.length; i++) {
            if (axis.contains(B[i])) {
                return B[i];
            }
        }

        return -1;
    }

}
