package org.example.programmers.java.level2;

import java.util.HashMap;
import java.util.Map;

public class 할인_행사 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }

    private static boolean isEquals(Map<String, Integer> map, String[] want, int[] number) {
        for (int i = 0; i < want.length; i++) {
            if (!map.containsKey(want[i]) || map.get(want[i]) != number[i]) {
                return false;
            }
        }
        return true;
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        // map을 사용할것
        // 복사본(map)을 생성하고 비교하여 일치하면 결과값을 증가시킴
        Map<String, Integer> map = new HashMap<>();
        //최초 10개를 map 에 입력 후 조건 확인
        for (int i = 0; i < 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        if (isEquals(map, want, number)) {
            answer++;
        }
        for (int i = 0; i < discount.length - 10; i++) {
            map.replace(discount[i], map.get(discount[i]) - 1);
            map.put(discount[i + 10], map.getOrDefault(discount[i + 10], 0) + 1);

            if (isEquals(map, want, number)) answer++;
        }
        return answer;
    }
}
