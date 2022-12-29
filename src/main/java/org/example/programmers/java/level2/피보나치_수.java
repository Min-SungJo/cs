package org.example.programmers.java.level2;

public class 피보나치_수 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i = 2;i<n;i++){
            arr[i]=arr[i-1]%1234567+arr[i-2]%1234567;
        }
        int answer = arr[n-1]%1234567;
        return answer;
    }

}
