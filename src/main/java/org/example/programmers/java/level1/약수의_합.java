package org.example.programmers.java.level1;


public class 약수의_합 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int sum = 0;
        for(int i = 1; i<n/2+1;i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
        sum+=n;
        return sum;
    }
}