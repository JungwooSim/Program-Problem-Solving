package me.study.baekjoon;

public class Section_9 {

    public void process() {
        Integer[] capacity = {10, 11, 12};
        Integer[] milk = {3, 4, 5};

        for (int i=0;i<100;i++) {
            int idx = i % 3; // 이렇게하면 0, 1, 2 가 반복
            int nextIdx = (idx + 1) % 3;

            // 만약에, 우유의 양이 capacity 보다 클 경우 또는 작을 경우
            if (capacity[nextIdx] < (milk[idx] + milk[nextIdx])) {
                milk[idx] = (milk[idx] + milk[nextIdx]) - capacity[nextIdx];
                milk[nextIdx] = capacity[nextIdx];
            } else {
                milk[nextIdx] = milk[idx] + milk[nextIdx];
                milk[idx] = 0;
            }
        }

        // 답
        for (int i=0; i < 3; i++) {
            System.out.println(capacity[i] +" "+ milk[i]);
        }
    }
}
