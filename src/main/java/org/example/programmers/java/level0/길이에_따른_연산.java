package org.example.programmers.java.level0;

import java.util.Arrays;

public class 길이에_따른_연산 {
    public static void main(String[] args) {
//        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list = {2, 3, 4, 5};
        int result = solution(num_list);
        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        return num_list.length >= 11
                ? Arrays.stream(num_list).sum()
                : Arrays.stream(num_list).reduce((total, n) -> total * n).getAsInt();
    }
}