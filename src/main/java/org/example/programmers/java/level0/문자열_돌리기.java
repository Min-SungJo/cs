package org.example.programmers.java.level0;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_돌리기 {
    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();
        char[] arr = input.toCharArray();
        for(char c : arr) {
            System.out.println(c);
        }
    }
}