package me.study.baekjoon;

/*
제목 : 나이순 정렬

온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

 */

import java.util.Arrays;
import java.util.Comparator;

class People {
    int age;
    String name;

    People(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Section_10814 {
    public static void main(String[] args) {

        People[] peoples = new People[3];
        peoples[0] = new People(21, "Junkyu");
        peoples[1] = new People(21, "Dohyun");
        peoples[2] = new People(20, "Sunyoung");


        for (People people : peoples) {
            System.out.println(people.age + " " + people.name);
        }

        Arrays.sort(peoples, Comparator.comparingInt(a -> a.age));

        for (People people : peoples) {
            System.out.println(people.age + " " + people.name);
        }

    }
}
