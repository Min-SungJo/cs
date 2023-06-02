package org.example.programmers.java.level0;

import java.util.HashSet;

public class 중복된_문자_제거 {
    public static void main(String[] args) {
        String my_string = "We are the world";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i ++) {
            char c = my_string.charAt(i);
            if(!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }
}