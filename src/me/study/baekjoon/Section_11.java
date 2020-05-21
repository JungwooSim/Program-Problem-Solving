package me.study.baekjoon;

import jdk.nashorn.api.tree.Tree;

import java.util.*;

public class Section_11 {

    public void process(Integer[] dice) {
        TreeSet<Integer> diceCount = new TreeSet<>();
        Arrays.stream(dice).forEach(e -> diceCount.add(e));

        Integer returnValue = 0;
        if (diceCount.size() == 1) {
            returnValue = 10000 + (diceCount.first() * 1000);
        }

        if (diceCount.size() == 2) {
            returnValue = 1000 + (diceCount.first() * 100);
        }

        if (diceCount.size() == 3) {
            returnValue = (diceCount.last() * 100);
        }

        System.out.println(returnValue);
    }
}
