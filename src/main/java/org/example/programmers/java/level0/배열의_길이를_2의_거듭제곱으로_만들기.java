package org.example.programmers.java.level0;

import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {
        int len = arr.length;
        if (len == 1) return arr;
        int num = 1;
        while (num < len) {
            num *= 2;
        }
        // 1
        int[] answer = new int[num];
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        // 2
        int[] other = Arrays.copyOf(arr, num);
        return answer;
    }
}