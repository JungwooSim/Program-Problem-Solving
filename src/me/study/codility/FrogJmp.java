package me.study.codility;

public class FrogJmp {
    public int solution(int X, int Y, int D){
        int count = (Y - X) / D;
        if ((Y - X) % D > 0) {
            count++;
        }
        return count;
    }
}
