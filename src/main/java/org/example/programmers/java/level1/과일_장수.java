package org.example.programmers.java.level1;

import java.util.Arrays;

public class 과일_장수 {

    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(k, m, score));
    }

    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        for (int i = m; i <= score.length; i += m) {
            answer += score[score.length - i] * m;
        }
        return answer;
    }
}
