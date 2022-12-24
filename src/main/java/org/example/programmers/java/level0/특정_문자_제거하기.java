package org.example.programmers.java.level0;

public class 특정_문자_제거하기 {
    public static void main(String[] args) {
        String x = "abc";
        String y = "b";
        System.out.println(solution(x,y));
    }

    private static String solution(String my_string, String letter) {
        String answer= my_string.replace(letter,"");
        return answer;
    }
}