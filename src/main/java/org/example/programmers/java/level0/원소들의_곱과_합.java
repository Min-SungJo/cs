package org.example.programmers.java.level0;

import java.util.Arrays;

public class 원소들의_곱과_합 {
    public static void main(String[] args) {
//        int[] num_list = {3, 4, 5, 2, 1};
        int[] num_list = {5, 7, 8, 3};
        int result = solution(num_list);
        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        // Math.pow(Arrays.stream(num_list).sum(),2);
        int mul = 1;
        for (int n : num_list) {
            mul *= n;
        }
        // Arrays.stream(num_list).reduce((total, n) -> total * n).getAsInt();
        return mul < sum * sum ? 1 : 0;
    }
}