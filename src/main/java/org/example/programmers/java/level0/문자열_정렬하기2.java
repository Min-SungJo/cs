package org.example.programmers.java.level0;

import java.util.Arrays;

public class 문자열_정렬하기2 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        my_string = my_string.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        Arrays.sort(arr);
        for(char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
}