package org.example.programmers.java.level1;

import java.util.HashMap;

public class 가운데_글자_가져오기 {

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        int length = s.length();
        int mid = length/2;
        if(length%2 == 1) {
            return String.valueOf(s.charAt(mid));
        } else {
            return s.substring(mid-1, mid+1);
        }
    }
}
