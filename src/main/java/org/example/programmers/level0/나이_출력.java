package org.example.programmers.level0;

import java.util.Scanner;

public class 나이_출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        System.out.println(solution(age));
    }

    private static int solution(int age) {

        int answer = 2023-age;
        return answer;
    }
}