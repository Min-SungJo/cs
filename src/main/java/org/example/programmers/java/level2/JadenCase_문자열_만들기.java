package org.example.programmers.java.level2;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        char c = ' ';
        for (int i = 0; i < len; i++) {
            int n = 0;
            if (c == ' ' && s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                n = 32;
            } else if (c != ' ' && s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                n = -32;
            }
            c = (char) (s.charAt(i) - n);
            sb.append(c);
        }
        return sb.toString();
    }

}
