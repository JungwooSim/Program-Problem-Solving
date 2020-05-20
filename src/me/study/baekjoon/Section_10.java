package me.study.baekjoon;

public class Section_10 {

    public void process() {
        System.out.println(recursive((int) Math.pow(2, 2),3,1));
    }

    public Integer recursive(Integer n, Integer x, Integer y) {
        if (n == 1) {
            return 0;
        }

        for (int i=0;i<2;i++) {
            for (int j=0; j<2; j++) {
                if (x < n * (i+1) && y < n * (i+1)) {
                    return (i*2+j) * n * n + recursive(n, x-n*i, y-n*i);
                }
            }
        }
    }
}
