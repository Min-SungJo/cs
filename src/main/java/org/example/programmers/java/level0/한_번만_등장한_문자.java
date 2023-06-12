package org.example.programmers.java.level0;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class 한_번만_등장한_문자 {
    public static void main(String[] args) {

        String s = "hello";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int count;
        for (char c : arr) {
            count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}