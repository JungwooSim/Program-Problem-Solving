package me.study.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Section_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> sequence = new ArrayList<>();
        int sequenceCount = scanner.nextInt();

        for (int i=0; i < sequenceCount; i++) {
            sequence.add(scanner.nextInt());
        }

        ArrayList<Integer> result = new ArrayList<>();

        result.add(sequence.get(0));

        for (int i=1; i < sequence.size(); i++) {
            Integer resultValueSum = 0;
            for (Integer resultVal : result) {
                resultValueSum = resultVal + resultValueSum;
            }
            result.add(sequence.get(i) * (i+1) - resultValueSum);
        }

        for (Integer resultVal : result) {
            System.out.println(resultVal);
        }
    }
}
