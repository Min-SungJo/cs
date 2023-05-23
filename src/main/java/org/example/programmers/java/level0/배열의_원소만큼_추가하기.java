package org.example.programmers.java.level0;

import java.util.Arrays;

public class 배열의_원소만큼_추가하기 {
    public static void main(String[] args) {
        int[] arr = {12, 1};
        int[] result = solution(arr);
        System.out.println(result);
    }

    private static int[] solution(int[] arr) {
        int len = 0;
        for (int a : arr) {
            len += a;
        }
        int[] answer = new int[len];
        int idx = 0;
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                answer[idx++] = i;
            }
        }
        return answer;
    }

}