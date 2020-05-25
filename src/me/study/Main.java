package me.study;

import me.study.codility.CyclicRotation;
import me.study.codility.OddOccurrencesInArray;

public class Main {
    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] data = {9,3,9,3,9,7,9};
        System.out.println(oddOccurrencesInArray.solution(data));
    }
}
