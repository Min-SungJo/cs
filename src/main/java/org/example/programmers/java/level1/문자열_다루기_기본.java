package org.example.programmers.java.level1;

public class 문자열_다루기_기본 {

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
