/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
 */

package me.study.codility;
import java.util.*;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,9};

        System.out.println(remindSolution(A));
    }

    // Map 자료구조에 key 는 값, value 는 count 를 넣고 나머지가 0이 아닌 key를 찾으면 됌.
    public static int remindSolution(int[] A) {
        Map<Integer, Integer> checkMap = new HashMap<>();

        Arrays.stream(A).forEach(value -> {
            if (checkMap.containsKey(value)) {
                checkMap.put(value, checkMap.get(value) + 1);
            } else {
                checkMap.put(value, 1);
            }
        });

        for (Map.Entry<Integer, Integer> entry : checkMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return 0;
    }

    // for 한번으로 해결. 넣음과 동시에 중복이 있으면 삭제
    public static int solution(int[] A) {
        Map<Integer, Integer> check = new HashMap<>();

        for (int value : A) {
            if (check.containsKey(value)) {
                check.put(value, check.get(value) + 1);
                if (check.get(value) % 2 == 0) {
                    check.remove(value);
                }
            } else {
                check.put(value, 1);
            }
        }
        return (int) check.keySet().toArray()[0];
    }
}
