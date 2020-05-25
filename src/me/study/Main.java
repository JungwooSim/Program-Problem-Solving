package me.study;

import me.study.codility.CyclicRotation;
import me.study.codility.FrogJmp;
import me.study.codility.PermMissingElem;
import me.study.codility.OddOccurrencesInArray;

public class Main {
    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] data = {2, 3, 1, 5};
        System.out.println(permMissingElem.solution(data));
    }
}
