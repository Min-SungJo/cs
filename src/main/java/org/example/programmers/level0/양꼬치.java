package org.example.programmers.level0;

import java.util.Scanner;

public class 양꼬치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        System.out.println(solution(num1, num2));
    }

    private static int solution(int n, int k) {
        k-=(n/10);
        int answer = n*12000+k*2000;
        return answer;
    }
}