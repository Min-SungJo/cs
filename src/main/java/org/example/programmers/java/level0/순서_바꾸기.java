package org.example.programmers.java.level0;

import java.util.Arrays;

public class 순서_바꾸기 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;
//        int[] num_list = {5, 2, 1, 7, 5};
//        int n = 3;
        int[] result = solution(num_list, n);
        System.out.println(result);
    }

    private static int[] solution(int[] num_list, int n) {
        int[] arr = new int[num_list.length];
        int idx = n;
        if(n != num_list.length) {
            for (int i = 0; i < num_list.length; i++) {
                arr[i] = num_list[idx++];
                if (idx == num_list.length) {
                    idx = 0;
                }
            }
            return arr;
        }
        else return num_list;
    }
}