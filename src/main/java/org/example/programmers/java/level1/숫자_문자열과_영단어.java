package org.example.programmers.java.level1;

import java.util.HashMap;

public class 숫자_문자열과_영단어 {

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i],Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
