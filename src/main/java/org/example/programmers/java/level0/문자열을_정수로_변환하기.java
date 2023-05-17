package org.example.programmers.java.level0;

public class 문자열을_정수로_변환하기 {
    public static void main(String[] args) {

        String str = "10";
        int result = solution(str);
        System.out.println(result);
    }

    private static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}