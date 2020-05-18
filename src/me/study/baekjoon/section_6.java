package me.study.baekjoon;

import java.util.ArrayList;
import java.util.HashMap;

public class section_6 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> team = new HashMap<>();
        ArrayList<String> teamMember;

        team.put("twice", new ArrayList<String>());
        team.put("blackpink", new ArrayList<String>());
        team.put("redvelvet", new ArrayList<String>());

        teamMember = new ArrayList<>();
        teamMember.add("jihyo");teamMember.add("dahyeon");teamMember.add("mina");teamMember.add("momo");teamMember.add("chaeyoung");
        teamMember.add("jeongyeon");teamMember.add("tzuyu");teamMember.add("sana");teamMember.add("nayeon");
        teamMember.sort(String::compareTo); // 출력할때 사전순으로 해야되므로 미리 정렬하여 삽입
        team.put("twice", teamMember);

        teamMember = new ArrayList<>();
        teamMember.add("jisu");teamMember.add("lisa");teamMember.add("rose");teamMember.add("jenny");
        teamMember.sort(String::compareTo); // 출력할때 사전순으로 해야되므로 미리 정렬하여 삽입
        team.put("blackpink", teamMember);

        teamMember = new ArrayList<>();
        teamMember.add("wendy");teamMember.add("irene");teamMember.add("seulgi");teamMember.add("yeri");teamMember.add("joy");
        teamMember.sort(String::compareTo); // 출력할때 사전순으로 해야되므로 미리 정렬하여 삽입
        team.put("redvelvet", teamMember);

        System.out.println(team);
    }
}
