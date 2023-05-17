package org.example.programmers.java.level0;

public class 소문자로_바꾸기 {
    public static void main(String[] args) {

        String str = "aBcDeFg";
        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        return str.toLowerCase();
    }
}