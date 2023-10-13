package org.example.programmers.java.level2;

import java.util.HashMap;

public class N개의_최소공배수 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        // 배열에 담긴 수들의 최소 공배수 구하기
        // 반복문을 통해 배열의 요소를 나눠 1로 만들기
        // 반복문은 1부터 증가
        // 요소가 1이 되는 값을 모두 곱해 주면 최소 공배수가 됨
        // 두 수의 최소공배수는 두 수의 곱을 두 수의 최대공약수를 나눈 것과 같다
        int len = arr.length;
        int lcm = arr[0];
        for (int i = 1; i < len; i++) {
            lcm = getLcm(lcm, arr[i]);
            System.out.println(lcm);
        }
        return lcm;
    }

    static int getLcm(int a, int b) {
        int gcd = getGcd(a, b);
        return a * b / gcd;
    }

    static int getGcd(int a, int b) {
        int temp = 0;
        while (a % b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

}
