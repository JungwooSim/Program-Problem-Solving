package me.study.programmers.hash;
/*
문제 설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
같은 전화번호가 중복해서 들어있지 않습니다.
 */
public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));
    }

    // (정확성 성공, 효율 실패)
    public static boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++ ) {
                if (phone_book[i].length() > phone_book[j].length()) {
                    if (phone_book[i].startsWith(phone_book[j])) {
                        return false;
                    }
                } else {
                    if (phone_book[j].startsWith(phone_book[i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // 다른 사람 코드 (정확성 성공, 효율 실패)
    public static boolean solution2(String[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {

            int hashPhone = phone_book[i].hashCode();
            int len = phone_book[i].length();

            for (int j = i + 1; j < phone_book.length; j++) {

                if (phone_book[j].length() >= len && hashPhone == (phone_book[j].substring(0, len).hashCode())) {
                    return false;
                } else if (phone_book[j].length() < len && phone_book[i].substring(0, phone_book[j].length()).hashCode() == phone_book[j].hashCode()) {
                    return false;
                }

            }
        }

        return true;
    }

    // 다른 사람 코드 (정확성 성공, 효율 실패)
    public static boolean solution3(String[] phone_book) {
        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
        return true;
    }
}
