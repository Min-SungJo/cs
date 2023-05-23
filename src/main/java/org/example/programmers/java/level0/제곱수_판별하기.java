package org.example.programmers.java.level0;

public class 제곱수_판별하기 {
    public static void main(String[] args) {
        int n = 976;
        int result = solution(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        return Math.sqrt((double)n)%1==0?1:2;
    }
}