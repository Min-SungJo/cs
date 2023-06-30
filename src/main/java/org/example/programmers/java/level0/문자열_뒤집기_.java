package org.example.programmers.java.level0;

public class 문자열_뒤집기_ {
    public static void main(String[] args) {

        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        String result = solution(my_string, s, e);
        System.out.println(result);
    }

    private static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string, 0, s);
        for(int i = 0; i < e-s+1; i++) {
            sb.append(my_string.charAt(e-i));
        }
        sb.append(my_string, e+1, my_string.length());
        return sb.toString();
    }
}