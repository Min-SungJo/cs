package org.example.programmers.java.level0;

import java.util.Scanner;

public class 덧셈식_출력하기 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(a+b);
        System.out.println(sb);
    }
}