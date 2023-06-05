package org.example.programmers.java.level0;


public class 합성수_찾기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i ++) {
            if(sumDivisor(i)>=3) {
                sum++;
            }
        }
        return sum;
    }
    private static int sumDivisor(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) sum ++;
            else if (n % i == 0) sum += 2;
        }
        return sum;
    }
}