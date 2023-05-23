package org.example.programmers.java.level0;

import java.util.Scanner;

public class 더_크게_합치기 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int result = solution(a, b);
        System.out.println(result);
    }

    private static int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int num1 = Integer.parseInt(sb.append(a).append(b).toString());
        sb.setLength(0);
        int num2 = Integer.parseInt(sb.append(b).append(a).toString());
        return num1>=num2?num1:num2;
    }
}