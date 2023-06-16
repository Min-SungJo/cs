package org.example.programmers.java.level1;

public class 문자열을_정수로_바꾸기 {

    public static void main(String[] args) {
        String s = "-1";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
