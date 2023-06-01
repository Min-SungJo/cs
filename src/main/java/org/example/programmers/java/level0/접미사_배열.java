package org.example.programmers.java.level0;

import java.util.Arrays;

public class 접미사_배열 {
    public static void main(String[] args) {
        String my_string = "banana";
        System.out.println(solution(my_string));
    }

    private static String[] solution(String my_string) {
        String[] arr = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i ++) {
            arr[i] = my_string.substring(i,my_string.length());
        }
        Arrays.sort(arr);
        return arr;
    }
}