package me.study.baekjoon;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
제목 : SHA-256

문자열 S가 주어졌을 때, SHA-256 해시값을 구하는 프로그램을 작성하시오.

 */
public class Section_10930 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String value = "Baekjoon";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(value.getBytes());
        byte[] valueToShaByte = md.digest();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<valueToShaByte.length; i++) {
            stringBuilder.append(Integer.toString((valueToShaByte[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("SHA-256 : " + stringBuilder.toString());
    }
}
