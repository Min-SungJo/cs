package org.example.programmers.java.level1;

public class x만큼_간격이_있는_n개의_숫자 {

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(solution(x, n));
    }

    public static long[] solution(int x, int n) {
        long[] arr = new long[n];
        for(int i = 1; i <= n; i ++) {
            arr[i-1] = (long)x*i;
        }
        return arr;
    }
}
