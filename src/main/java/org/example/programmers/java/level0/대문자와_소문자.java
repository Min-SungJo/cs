package org.example.programmers.java.level0;

public class 대문자와_소문자 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        for (int i = 0; i < my_string.length(); i++) {
            c = my_string.charAt(i);
            if (c >= 97) {
                sb.append(my_string.substring(i, i + 1).toUpperCase());
            } else {
                sb.append(my_string.substring(i, i + 1).toLowerCase());
            }
        }
        return sb.toString();
    }
}