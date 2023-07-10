package org.example.programmers.java.level1;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(solution(strings, n));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings,(s1,s2) -> {
            if(s1.charAt(n) > s2.charAt(n)) return 1; // s1이 크면 s1을 뒤로
            else if (s1. charAt(n)==s2.charAt(n)) return s1.compareTo(s2); // s1 과 s2 가 동일하면, 둘을 비교해서 정렬
            else return -1;
        });
        return strings;
    }
}
