package me.study.me;

import java.util.ArrayList;

public class FibonacciNumbers {
    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();

        int count = 10;
        System.out.println(fibonacciNumbers.fibonacciNumbers(count));
    }

    public int fibonacciNumbers(int count) {
        int result = 0;
        ArrayList<Integer> fibonacci = new ArrayList<>();

        int i = 2;
        fibonacci.add(0);
        fibonacci.add(1);

        while (i < count) {
            int sum = fibonacci.get(fibonacci.size()-1) + fibonacci.get(fibonacci.size()-2);
            fibonacci.add(sum);
            result += sum;
            i++;
        }
        System.out.println(fibonacci);
        return result + 1;
    }
}
/*
0 = 0
1 = 1
0 + 1 = 1
1 + 1 = 2
1 + 2 = 3
2 + 3 = 5
3 + 5 = 8
5 + 8 = 13




 */
