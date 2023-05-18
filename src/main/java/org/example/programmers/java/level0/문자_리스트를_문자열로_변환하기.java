package org.example.programmers.java.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        String result = solution(arr);
        System.out.println(result);
    }

    private static String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for(String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}