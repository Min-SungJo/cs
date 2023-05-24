package org.example.programmers.java.level0;

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {

        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(solution(my_strings, parts));
    }

    private static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < parts.length; i ++) {
            sb.append(my_strings[i].substring(parts[i][0],parts[i][1]+1));
        }
        return sb.toString();
    }
}