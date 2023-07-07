package org.example.programmers.java.level0;

public class 코드_처리하기 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        System.out.println(solution(code));
    }

    private static String solution(String code) {
        int len = code.length();
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = code.charAt(i);
            if (c == '1') { // change mode
                mode = (mode + 1) % 2;
            } else if (i % 2 == mode) {
                sb.append(c);
            }
        }
        if (sb.length()==0) return "EMPTY";
        return sb.toString();
    }
}