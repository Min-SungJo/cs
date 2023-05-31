package org.example.programmers.java.level0;


public class 약수_구하기 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solution(n));
    }

    private static int[] solution(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) sum ++;
            else if (n % i == 0) sum += 2;
        }
        int[] arr = new int[sum];
        int idx =0;
        for(int i = 1; i<n/2+1;i++) {
            if(n%i==0) {
                arr[idx++]=i;
            }
        }
        arr[sum-1]=n;
        return arr;
    }
}