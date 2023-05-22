package org.example.programmers.java.level0;

import java.util.Arrays;

public class 홀수vs짝수 {
    public static void main(String[] args) {

        int[] num_list = {4, 2, 6, 1, 7, 6};
        int result = solution(num_list);
        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 1) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        return odd > even ? odd : even;
    }
}