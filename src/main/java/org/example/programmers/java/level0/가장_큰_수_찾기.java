package org.example.programmers.java.level0;

import java.util.Arrays;

public class 가장_큰_수_찾기 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        int[] result = solution(array);
        System.out.println(result);
    }

    private static int[] solution(int[] array) {
        int[] answer = {array[0], 0};
        for (int i = 1; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}