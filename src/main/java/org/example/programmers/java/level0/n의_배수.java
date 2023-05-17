package org.example.programmers.java.level0;

import java.util.Arrays;

public class n의_배수 {
    public static void main(String[] args) {
        int num = 34;
        int n = 3;
        int result = solution(num , n);
        System.out.println(result);
    }
    public static int solution(int num, int n) {
        return (num%n==0)?1:0;

    }
}
