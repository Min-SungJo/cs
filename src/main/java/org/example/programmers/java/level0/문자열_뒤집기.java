package org.example.programmers.java.level0;

public class 문자열_뒤집기 {
    public static void main(String[] args) {
        String x = "abc";
        System.out.println(solution(x));
    }

    private static String solution(String my_string) {
        String answer= new StringBuffer(my_string).reverse().toString();
        return answer;
    }
}