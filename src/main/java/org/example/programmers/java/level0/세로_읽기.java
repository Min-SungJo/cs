package org.example.programmers.java.level0;

public class 세로_읽기 {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        System.out.println(solution(my_string, m, c));
    }

    private static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for(int i = c-1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}