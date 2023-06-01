package org.example.programmers.java.level0;

public class 문자열_섞기 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1,str2));
    }

    private static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return sb.toString();
    }
}