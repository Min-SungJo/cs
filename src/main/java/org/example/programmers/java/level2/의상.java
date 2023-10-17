package org.example.programmers.java.level2;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        // 1
        // 1+1
        // 3
        // 3+1
        // 해시 활용, 중복 의상이 존재하지 않으니, String 배열이 아닌 Integer 활용 가능해보임
        // 특정 범주의 의상을 선택하지 않는 경우가 존재 -> 요소가 3개 있다면 경우의 수는 4임 -> 1개*3 + 0개*1
        // 최소 하나의 의상을 선택해야 함 -> 결과값에 +1
        Map<String, Integer> map = new HashMap<>();
        String key;
        int value;
        for (String[] list : clothes) {
            key = list[1];
            value = map.getOrDefault(key, 1) + 1; // 0을 선택할 경우 고려하여 기본값을 0이 아닌 1로 설정
            map.put(key, value);
        }
        for(int i : map.values()) {
            answer*=i;
        }
        answer--;
        return answer;
    }

}
