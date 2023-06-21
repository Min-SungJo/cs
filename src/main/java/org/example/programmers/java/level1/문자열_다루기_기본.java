package org.example.programmers.java.level1;

public class 문자열_다루기_기본 {

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        int numCheck = s.replaceAll("[0-9]","").length();
        boolean b = s.matches("(^[0-9]*)");
        System.out.println("정규 표현식: "+ b);
        return numCheck==0;
    }
}
