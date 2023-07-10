package org.example.programmers.java.level1;

public class 소수찾기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int sum = 0;
        for(int i = 2; i<= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j ++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) sum++;

        }
        return sum;
    }

}