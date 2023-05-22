package org.example.programmers.java.level0;

import java.util.Scanner;

public class 문자열_붙여서_출력하기 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        String b = sc.next();
        sb.append(a);
        sb.append(b);
        System.out.println(sb);
    }
}