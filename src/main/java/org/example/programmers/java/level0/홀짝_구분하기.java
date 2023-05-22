package org.example.programmers.java.level0;

import java.util.Scanner;

public class 홀짝_구분하기 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(n%2==0?" is even":" is odd");
        System.out.print(n);
        System.out.println(sb);
    }
}