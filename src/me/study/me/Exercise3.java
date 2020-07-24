package me.study.me;

public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
//        int[] A = {1,1000,80,-91};
//        int[] A = {47,1900,1,90,45};
        int[] A = {-13,1900,1,100,45};

        System.out.println(exercise3.solution(A));
    }
    public int solution(int[] A) {
        int value = 0;

        for (int i=0; i<A.length; i++) {
            if (A[i] >= 10 && A[i] <= 99 || A[i] <= -11 && A[i] >= -99) {
                value += A[i];
            }
        }

        return value;
    }

}
