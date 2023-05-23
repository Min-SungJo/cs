package org.example.programmers.java.level0;

public class 암호_해독 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher,code));
    }

    private static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for(int i = code-1; i < cipher.length(); i+=code) {
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}