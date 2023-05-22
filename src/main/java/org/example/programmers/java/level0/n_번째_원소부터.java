package org.example.programmers.java.level0;

import java.util.Arrays;

public class n_번째_원소부터 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int num = 2;
        int[] result = solution(num_list, num);
        System.out.println(result);
    }

    private static int[] solution(int[] num_list, int n) {
         return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}