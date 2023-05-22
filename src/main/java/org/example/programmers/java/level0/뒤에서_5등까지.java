package org.example.programmers.java.level0;

import java.util.Arrays;

public class 뒤에서_5등까지 {
    public static void main(String[] args) {

        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] result = solution(num_list);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

    private static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] sort_list = new int[5];
        for(int i = 0; i < sort_list.length; i++) {
            sort_list[i] = num_list[i];
        }
        return sort_list;
    }
}