package org.example.programmers.java.level0;

import java.util.Scanner;

public class 직각삼각형_출력하기 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}