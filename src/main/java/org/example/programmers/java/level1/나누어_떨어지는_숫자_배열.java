package org.example.programmers.java.level1;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(solution(arr, divisor));
    }

    public static int[] solution(int[] arr, int divisor) {
        int idx = 0;
        for (int i : arr) {
            if (i % divisor == 0) {
                arr[idx] = i;
                idx++;
            }
        }
        if (idx == 0) {
            return new int[]{-1};
        }
        int[] answer = new int[idx];
        System.arraycopy(arr, 0, answer, 0, idx);
        for (int i : answer) {
            System.out.println(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}