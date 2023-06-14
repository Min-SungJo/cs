package org.example.programmers.java.level1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }

    public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n).reverse();
        int length = sb.length();
        int[] answer = new int[length];
        for(int i = 0; i < length; i++) {
            answer[i] = sb.charAt(i)-'0';
        }
        return answer;
    }
}