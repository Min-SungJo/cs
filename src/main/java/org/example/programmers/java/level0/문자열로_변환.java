package org.example.programmers.java.level0;

public class 문자열로_변환 {
    public static void main(String[] args) {

        int n = 10;
        String result = solution(n);
        System.out.println(result);
    }

    private static String solution(int n) {
        return Integer.toString(n);
    }
}