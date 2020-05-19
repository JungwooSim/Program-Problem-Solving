package me.study.baekjoon;

import java.util.ArrayList;

public class Section_8 {
    private Integer childCount;
    private ArrayList<Integer> initCandy = new ArrayList<>();

    public void process() {
        childCount = 5;
        initCandy.add(2);initCandy.add(4);initCandy.add(7);initCandy.add(8);initCandy.add(9);

//        childCount = 1;
//        initCandy.add(9);

//        childCount = 6;
//        initCandy.add(10);initCandy.add(5);initCandy.add(13);initCandy.add(2);initCandy.add(7);initCandy.add(8);

//        childCount = 4;
//        initCandy.add(3);initCandy.add(4);initCandy.add(4);initCandy.add(3);

        Integer loopCount = 0;
        while (!candyEqualCheck(initCandy)) {
            loopCount++;

            initCandy = teacher(initCandy);
        }

        System.out.println(loopCount);
    }

    public ArrayList<Integer> teacher(ArrayList<Integer> initCandy) {
        // 초기화
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int value : initCandy) {
            tempList.add(0);
        }

        for (int index=0; index < initCandy.size(); index++) {
            Integer halfCandyCount = 0;
            if (initCandy.get(index) % 2 == 1) {
                initCandy.set(index, initCandy.get(index)+1);
            }
            // 아이들의 캔디를 반으로 나누기
            halfCandyCount = initCandy.get(index)/2;
            initCandy.set(index, halfCandyCount);
            // 오른쪽으로 돌려야되는 캔디 리스트
            tempList.set((index + 1) % initCandy.size(), initCandy.get(index));
        }

        for (int index=0; index < initCandy.size(); index++) {
            initCandy.set(index, initCandy.get(index) + tempList.get(index));
        }

        return initCandy;
    }


    public boolean candyEqualCheck(ArrayList<Integer> initCandy) {
        // 캔디를 짝수로 맞추는 과정
        for (int i=0; i<initCandy.size(); i++) {
            if (initCandy.get(i) % 2 == 1) {
                initCandy.set(i, initCandy.get(i)+1);
            }
        }

        // 동일한 개수를 가지는지 확인 과정
        for (int i=0; i<initCandy.size()-1; i++) {
            if (initCandy.get(i) != initCandy.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
