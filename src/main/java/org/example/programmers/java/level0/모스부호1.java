package org.example.programmers.java.level0;

import java.util.Arrays;

public class 모스부호1 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }

    private static String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String target = arr[i];
            int code = Arrays.asList(morse).indexOf(target);
            sb.append((char) ('a' + code));
        }
        return sb.toString();
    }
}