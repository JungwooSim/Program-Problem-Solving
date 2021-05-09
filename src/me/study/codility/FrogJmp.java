/*
A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }
that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
 */

package me.study.codility;

public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(remindSolution(10, 85, 30));
    }

    // Y - X 계산 후 D 로 나눈 값이 얼마냐를 찾으면 됨.
    // 단, 나머지 값이 0보다 크다면 한번더 Jmp 를 해야하므로 + 1 을 해주는 값을 포함
    public static int remindSolution(int X, int Y, int D) {
        int count = (Y - X) / D;
        if ((Y - X) % D > 0) {
            count++;
        }
        return count;
    }

    public static int solution(int X, int Y, int D){
        int count = (Y - X) / D;
        if ((Y - X) % D > 0) {
            count++;
        }
        return count;
    }
}
