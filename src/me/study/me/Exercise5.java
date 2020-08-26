package me.study.me;

import java.util.HashSet;

public class Exercise5 {
    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();

//        int[] A = {3,2,-2,5,-3};
//        int[] A = {1,1,2,-1,2,-1};
        int[] A = {1,2,3,-4};

        System.out.println(exercise5.solution(A));
    }

    public int solution(int[] A) {
        HashSet<Integer> temp = new HashSet();
        int maxValue = 0;

        for (int i=0; i<A.length; i++) {
            if (temp.contains(A[i]*-1)) {
                if (maxValue < Math.abs(A[i])) {
                    maxValue = Math.abs(A[i]);
                }
            } else {
                temp.add(A[i]);
            }
        }
        return maxValue;
    }
}
