package org.example.programmers.java.level0;

import java.util.Arrays;

public class 정수_찾기 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;
        int result = solution(num_list, n);
        System.out.println(result);
    }

    private static int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(num -> num == n) ? 1 : 0;
    }
}