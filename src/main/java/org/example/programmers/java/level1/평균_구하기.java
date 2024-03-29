package org.example.programmers.java.level1;

import java.util.Arrays;
import java.util.OptionalDouble;

public class 평균_구하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        double result = solution(arr);
        System.out.println(result);
    }

    private static double solution(int[] arr) {
        int len = arr.length;
        double avg = 0;
        for (int i = 0; i < len; i++) {
            avg += arr[i];
        }
        return avg / len;
    }
}