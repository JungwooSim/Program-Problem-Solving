package me.study.me;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();

        List<Integer[]> item = new ArrayList<>(){
            {
                add(new Integer[]{0, 0});
                add(new Integer[]{6, 13});
                add(new Integer[]{4, 8});
                add(new Integer[]{3, 6});
                add(new Integer[]{5, 12});
            }
        };

        knapsack.knapsack(7, item);
    }

    public void knapsack(int w, List<Integer[]> item) {
        int[][] dynamicArray = new int[item.size()][w+1];
        int max = 0;

        for (int i=1; i < item.size(); i++) {
            for (int j=0; j <= w; j++) {
                if (j >= item.get(i)[0]) {
                    dynamicArray[i][j] = Math.max(dynamicArray[i-1][j], item.get(i)[1] + dynamicArray[i][j - item.get(i)[0]]);
                } else {
                    dynamicArray[i][j] = dynamicArray[i-1][j];
                }
                max = Math.max(dynamicArray[i][j], max);
            }
        }

        System.out.println(max);
    }
}
