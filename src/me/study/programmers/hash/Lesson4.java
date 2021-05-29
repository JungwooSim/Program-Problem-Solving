package me.study.programmers.hash;

import java.util.*;

/*
제목 : 베스트앨범 (코딩테스트 연습 -> 해쉬)

-- 문제 설명
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

-- 제한사항
genres[i]는 고유번호가 i인 노래의 장르입니다.
plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
장르 종류는 100개 미만입니다.
장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
모든 장르는 재생된 횟수가 다릅니다.

-- 입출력 예
genres	plays	return
["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0

 */
public class Lesson4 {
    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution(genres, plays)));
    }

    // 전략 : 최대한 메모리를 사용하여 데이터를 전처리 후 사용
    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genresAndPlayTotalCount = new HashMap<>();
        Map<String, ArrayList<Integer>> playsOfGenres = new HashMap<>();
        Map<Integer, Integer> playsMap = new HashMap<>();

        for (int i = 0; i < plays.length; i++) {
            ArrayList<Integer> qq = playsOfGenres.getOrDefault(genres[i], new ArrayList());
            qq.add(plays[i]);
            playsOfGenres.put(genres[i], qq);

            genresAndPlayTotalCount.put(genres[i], genresAndPlayTotalCount.getOrDefault(genres[i], 0) + plays[i]);

            playsMap.put(plays[i], i);
        }

        // 정렬을 위한 Map
        Map<Integer, String> sortMap = new TreeMap<>(Collections.reverseOrder());
        genresAndPlayTotalCount.forEach((key, value) -> {
            sortMap.put(value, key);
        });

        ArrayList<Integer> resultList = new ArrayList<>();
        int i = 0;
        for (String value : sortMap.values()) {
            int j = 0;
            Collections.sort(playsOfGenres.get(value), Collections.reverseOrder());
            for (Integer value2 : playsOfGenres.get(value)) {

                if (j > 1) {
                    break;
                }

                resultList.add(playsMap.get(value2));
                i++;
                j++;
            }
        }

        return resultList.stream().mapToInt(v -> v).toArray();
    }
}
