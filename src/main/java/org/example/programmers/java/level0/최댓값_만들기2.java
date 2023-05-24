package org.example.programmers.java.level0;

import java.util.Arrays;

public class 최댓값_만들기2 {
    public static void main(String[] args) {
        int[] numbers = {0, -31, 24, 10, 1, 9};
        int result = solution(numbers);
        System.out.println(result);
    }

    private static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int front = numbers[0] * numbers[1];
        int back = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        Math.max(1,2);
        return front >= back ? front : back;
    }
}