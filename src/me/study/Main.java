package me.study;

import me.study.codility.*;

public class Main {
    public static void main(String[] args) {
        int[] data = {3, 4, 4, 6, 1, 4, 4};

        MaxCounters maxCounters = new MaxCounters();
        System.out.println(maxCounters.solution(5, data));
    }
}
