package org.example.programmers.java.level0;

public class 문자열안에_문자열 {
    public static void main(String[] args) {
        String x = "abc";
        String y = "b";
        System.out.println(solution(x,y));
    }

    private static int solution(String str1, String str2) {
        int answer=str1.contains(str2)? 1: 2;
        return answer;
    }
}