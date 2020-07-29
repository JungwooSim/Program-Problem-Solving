package me.study.codility;

import java.util.Stack;

/*
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

- S is empty;
- S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
- S has the form "VW" where V and W are properly nested strings.

For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }
that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 */
public class Brackets {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();

        String S = "{[()()]}";
//        String S = "([)()]";

        System.out.println(brackets.solution(S));
    }
    public int solution(String S) {
        Stack<Character> stack = new Stack();
        int returnVal = 1;

        for (int i=0; i<S.length(); i++) {
            char s = S.charAt(i);

            if (s == '{' || s == '[' || s == '(' ) {
                stack.push(s);
            } else {
                if (!stack.empty()) {
                    char popS = stack.pop();

                    if (s == '}' && popS != '{') {
                        returnVal = 0;
                    }

                    if (s == ']' && popS != '[') {
                        returnVal = 0;
                    }

                    if (s == ')' && popS != '(') {
                        returnVal = 0;
                    }
                } else {
                    returnVal = 0;
                }
            }
        }

        if (!stack.empty()) {
            returnVal = 0;
        }

        return returnVal;
    }
}
