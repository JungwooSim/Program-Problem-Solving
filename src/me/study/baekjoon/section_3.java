package me.study.baekjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class section_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int name_1_count = scanner.nextInt();
        int name_2_count = scanner.nextInt();
        String name_1 = scanner.next();
        String name_2 = scanner.next();

        StringBuilder preprocessingName = new StringBuilder();
        ArrayList<Integer> nameChangeNumber = new ArrayList<>();

        HashMap<String, Integer> writeCount = new HashMap<String, Integer>(){
            {
                put("A", 3); put("B", 2); put("C", 1); put("D", 2); put("E", 4); put("F", 3); put("G", 1);
                put("H", 3); put("I", 1); put("J", 1); put("K", 3); put("L", 1); put("M", 3); put("N", 2);
                put("O", 1); put("P", 2); put("Q", 2); put("R", 2); put("S", 1); put("T", 2); put("U", 1);
                put("V", 1); put("W", 1); put("X", 2); put("Y", 2); put("Z", 1);
            }
        };

        int nameMaxLen = name_1.length() > name_2.length() ? name_1.length() : name_2.length();
        int nameMinLen = name_1.length() > name_2.length() ? name_2.length() : name_1.length();

        for (int i=0; i < nameMinLen; i++ ) {
            preprocessingName.append(name_1.charAt(i));
            preprocessingName.append(name_2.charAt(i));
        }

        if (name_1.length() > name_2.length()) {
            preprocessingName.append(name_1.substring(nameMinLen, nameMaxLen));
        } else {
            preprocessingName.append(name_2.substring(nameMinLen, nameMaxLen));
        }

        for (int i=0;i<preprocessingName.length(); i++) {
            nameChangeNumber.add(writeCount.get(String.valueOf(preprocessingName.toString().charAt(i))));
        }

        // 2개 남을때까지 돌려야 되므로 -2
        for (int i = 0; i < nameChangeNumber.size() - 2; i++) {
            // 1개씩 줄이므로 -i, 처음에 1개를 빼야하므로 -1
            for (int j = 0; j < (nameChangeNumber.size()-1-i); j++) {
                nameChangeNumber.set(j, nameChangeNumber.get(j)+nameChangeNumber.get(j+1));
            }
        }

        String name_1_value = nameChangeNumber.get(0) % 10 == 0 ? "" : String.valueOf(nameChangeNumber.get(0) % 10);
        String name_2_value = nameChangeNumber.get(1) % 10 == 0 ? "" : String.valueOf(nameChangeNumber.get(1) % 10);

        System.out.println(name_1_value + name_2_value + "%");
    }
}
