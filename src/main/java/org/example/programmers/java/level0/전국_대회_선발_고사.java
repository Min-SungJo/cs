package org.example.programmers.java.level0;

import java.util.Arrays;
import java.util.HashMap;

public class 전국_대회_선발_고사 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println(solution(rank, attendance));
    }

    private static int solution(int[] rank, boolean[] attendance) {
        // 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rank.length; i++) { // true 조건만 map 에 삽입
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        int[] list = new int[map.size()];
        int idx = 0;
        for (int i : map.keySet()) { // map 을 정렬하기 위한 list
            list[idx++] = i;
        }
        Arrays.sort(list);
        int a = map.get(list[0]);
        int b = map.get(list[1]);
        int c = map.get(list[2]);
        int answer = 10000*a+100*b+c;
        return answer;
    }
}