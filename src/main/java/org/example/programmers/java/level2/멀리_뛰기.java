package org.example.programmers.java.level2;

public class 멀리_뛰기 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    public static long solution(int n) {
        int[] arr = new int[2000];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i < n; i++) {
            arr[i] = arr[i-1]%1234567 + arr[i-2]%1234567;
        }
        long ans = arr[n-1];
        return ans%1234567;
    }
}
