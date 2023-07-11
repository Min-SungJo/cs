package org.example.programmers.java.level1;

public class 시저_암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s, n));
    }

    public static String solution(String s, int n) {
        // 알파벳만 오른쪽으로 n 만큼 밀기 (소문자 -> 소문자, 대문자 -> 대문자)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c = 'A' + (c - 'A' + n) % 26;
            } else if (c >= 97 && c <= 122) {
                c = 'a' + (c - 'a' + n) % 26;
            }
            sb.append((char) c);
        }
        return sb.toString();
    }
}