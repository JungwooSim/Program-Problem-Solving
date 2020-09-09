package me.study.me;

import java.util.ArrayList;
import java.util.List;

public class Hanoi {
    public static void main(String[] args) {
        Hanoi hanoiClass = new Hanoi();
        List<Integer> A = new ArrayList<>(){
            {
                add(7);
                add(6);
                add(5);
                add(4);
                add(3);
                add(2);
                add(1);
            }
        };
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        hanoiClass.hanoi(A, C, B);
    }

    public void hanoi(List<Integer> start, List<Integer> end, List<Integer> via) {

        for (int i=start.size()-1; i >= 0; i--) {
            if (start.size() % 2 == 0) {
                move(start, via, end, i);
            } else {
                move(start, end, via, i);
            }

        }
        System.out.println(end);
    }

    private void move(List<Integer> start, List<Integer> end, List<Integer> via, int i) {
        if (end.isEmpty()) {
            end.add(start.get(i));
            end.addAll(via);
            via.clear();
        } else {
            via.add(start.get(i));
            via.addAll(end);
            end.clear();
        }
    }
}
/*
1.
처음 원반을 B로 놓고
두 번째 원반을 C로 놓는다
그리고 B에 있던걸 C에 쌓여있던 원반 위에 올린다.

2.
세번째 원반을 B로 넣는다
C에 있던 원반을 B로 넣는다

3.
네 번째 원반을 C로 넣는다
B 에 있던 원반을 C로 넣는다.
 */
