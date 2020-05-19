package me.study.baekjoon;

import java.util.ArrayList;

public class Section_7 {
    public static void main(String[] args) {
        Integer point = 0;
        Integer problemCount; // 문제의 수
        Integer ability; // 나의 역량
        Integer solveProblemCount; // 풀 수 있는 문제 수

        Integer solveEasyProblemCount = 0;
        Integer solveHardProblemCount = 0;

        Integer easyProblemPoint = 100;
        Integer hardProblemPoint = 140;

        ArrayList<Integer> neededEasyProblem = new ArrayList<>(); // 쉬운 문제의 필요 역량
        ArrayList<Integer> neededHardProblem = new ArrayList<>(); // 어려운 문제의 필요 역량

//        problemCount = 4;
//        ability = 8;
//        solveProblemCount = 4;
//
//        neededEasyProblem.add(1);neededEasyProblem.add(4);neededEasyProblem.add(6);neededEasyProblem.add(9);
//        neededHardProblem.add(8);neededHardProblem.add(5);neededHardProblem.add(20);neededHardProblem.add(12);

//        problemCount = 8;
//        ability = 7;
//        solveProblemCount = 5;
//
//        neededEasyProblem.add(1);neededEasyProblem.add(2);neededEasyProblem.add(3);neededEasyProblem.add(4);neededEasyProblem.add(5);neededEasyProblem.add(6);
//        neededEasyProblem.add(6);neededEasyProblem.add(7);
//
//        neededHardProblem.add(3);neededHardProblem.add(5);neededHardProblem.add(5);neededHardProblem.add(8);neededHardProblem.add(8);neededHardProblem.add(9);
//        neededHardProblem.add(7);neededHardProblem.add(10);
        problemCount = 8;
        ability = 9;
        solveProblemCount = 5;

        neededEasyProblem.add(1);neededEasyProblem.add(3);neededEasyProblem.add(4);neededEasyProblem.add(5);neededEasyProblem.add(7);neededEasyProblem.add(8);
        neededEasyProblem.add(9);neededEasyProblem.add(14);

        neededHardProblem.add(8);neededHardProblem.add(10);neededHardProblem.add(5);neededHardProblem.add(20);neededHardProblem.add(12);neededHardProblem.add(15);
        neededHardProblem.add(50);neededHardProblem.add(14);

        for (int index = 0; index < problemCount; index++) {
            if (neededHardProblem.get(index) <= ability) {
                solveHardProblemCount++;
            } else if(neededHardProblem.get(index) > ability && neededEasyProblem.get(index) <= ability) {
                solveEasyProblemCount++;
            }
        }

        if (solveProblemCount >= (solveHardProblemCount + solveEasyProblemCount)) {
            point = solveHardProblemCount * hardProblemPoint + solveEasyProblemCount * easyProblemPoint;
        } else {
            if ((solveProblemCount - solveHardProblemCount) >= 0) {
                point = solveHardProblemCount * hardProblemPoint;
                solveProblemCount = solveProblemCount - solveHardProblemCount;

                if ((solveProblemCount - solveEasyProblemCount) >= 0) {
                    point += solveEasyProblemCount * easyProblemPoint;
                } else {
                    point += solveProblemCount * easyProblemPoint;
                }

            } else {
                point = solveProblemCount * hardProblemPoint;
            }
        }

        System.out.println(point);
    }
}
