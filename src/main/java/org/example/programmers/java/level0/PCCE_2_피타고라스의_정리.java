package org.example.programmers.java.level0;

import java.util.Scanner;

public class PCCE_2_피타고라스의_정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int c = 5;

//        int b_square = Math.abs(c*c - a*a);
        int b_square = (c - a) * (c + a);

        System.out.println(b_square);
    }
}