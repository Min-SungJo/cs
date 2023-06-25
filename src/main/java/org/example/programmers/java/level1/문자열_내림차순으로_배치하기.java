package org.example.programmers.java.level1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < length; i++) {
            sb.append(arr[length-1-i]);
        }
        return sb.toString();
    }
}
