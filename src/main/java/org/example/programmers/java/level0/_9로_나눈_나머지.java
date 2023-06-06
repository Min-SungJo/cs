package org.example.programmers.java.level0;

import java.util.Scanner;

public class _9로_나눈_나머지 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        System.out.println(solution(number));
    }

    private static int solution(String number) {
        char[] arr = number.toCharArray();
        int sum = 0;
        for(char c : arr) {
            sum+=c-'0';
        }
        return sum%9;
    }
}