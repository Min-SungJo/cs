package org.example.programmers.java.level2;

import java.util.HashMap;
import java.util.Map;

public class 튜플 {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(solution(s));
    }

    public static int[] solution(String s) {
        Map<String , Integer> map = new HashMap<>();
        String[] list = (s.replaceAll("[\\{\\}]", "")).split(",");
        String key;
        int value;
        for (String str : list) {
            key = str;
            value = map.getOrDefault(key, 0) + 1;
            map.put(key, value);
        }
        int size = map.size();
        int[] answer = new int[size];
        // 중복허용, 순서가 있음, 원소 개수 유한함
        // 가장 빈번히 나온 숫자 순으로 구성
        // 횟수를 저장하기 위해 HashMap 활용
        // hahMap 의 크기를 int[] answer 크기로,
        // 1:1 2:3 3:2
        // 2 3 1
        // 3 3 3
        // 3 2 1
        // size - 횟수 = idx
        int cnt;
        for(String str : map.keySet()) {
            cnt = map.get(str);
            answer[size-cnt] = Integer.parseInt(str);
        }
        return answer;
    }

}
