package me.study.me;

/*
String 을 계산하기
 */
public class Exercise10 {
    public static void main(String[] args) {
        Exercise10 exercise10 = new Exercise10();
        String s = "1+2-3+5";
        exercise10.solution(s);
    }

    public void solution(String s) {

        String[] numbers = s.split("[\\+|\\-|\\*|\\*]");
        String[] operator = s.split("[0-9]+");

        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i < operator.length; i++) {

            if (i == 1) {
                num1 = Integer.valueOf(numbers[i-1]);
                num2 = Integer.valueOf(numbers[i]);
            } else {
                num2 = Integer.valueOf(numbers[i]);
            }

            switch (operator[i]) {
                case "-" :
                    num1 = num1 - num2;
                    break;
                case "+" :
                    num1 = num1 + num2;
                    break;
                case "*" :
                    num1 = num1 * num2;
                    break;
                case "/" :
                    num1 = num1 / num2;
                    break;
            }
        }
        System.out.println(num1);
    }
}
