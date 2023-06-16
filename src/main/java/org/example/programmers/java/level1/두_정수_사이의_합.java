package org.example.programmers.java.level1;


public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println(solution(a, b));
    }

    private static long solution(int a, int b) {
        // 등차수열의 합 공식
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        return (max-min+1)*(max+min)/2;
    }
}