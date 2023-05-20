package org.example.programmers.java.level0;

public class 부분_문자열 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";
        int result = solution(str1, str2);
        System.out.println(result);
    }

    private static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}