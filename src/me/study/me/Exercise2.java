package me.study.me;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();

        int[] A = {1,1,2,3,3};
        int K = 3;

        System.out.println(exercise2.solution(A, K));
    }

    public boolean solution(int[] A, int K) {

        int aLength = A.length;

        if (A[0] != 1 || A[aLength-1] != K) {
            return false;
        }

        for (int i=0; i<aLength-1; i++) {
            System.out.println(A[i+1]);
            if (A[i]+1 < (A[i+1])) {
                return false;
            }
        }
        return true;
    }
}
