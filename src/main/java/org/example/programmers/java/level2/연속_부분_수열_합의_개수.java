package org.example.programmers.java.level2;

import java.util.HashSet;

public class 연속_부분_수열_합의_개수 {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(solution(elements));
    }

    public static int solution(int[] elements) {
        // 포인터 사용
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int start = 0; start < elements.length; start++) { // 시작 지점, 반복 횟수
            for (int i = 0; i < elements.length; i++) { // 수열 길이
                sum += elements[(i+start)%elements.length];
                set.add(sum);
            }
            sum = 0;
        }
        answer += set.size();
        return answer;
    }
}
