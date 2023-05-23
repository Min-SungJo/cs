package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class n개_간격의_원소들 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int num = 4;
        int[] result = solution(num_list, num);
        System.out.println(result);
    }

    private static int[] solution(int[] num_list, int n) {
        int len = num_list.length/n;
        if(num_list.length%n!=0) len++;
        int[] arr = new int[len];
        int idx = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            arr[idx++] = (num_list[i]);
        }
        return arr;
    }
}