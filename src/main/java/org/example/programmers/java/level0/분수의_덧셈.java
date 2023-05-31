package org.example.programmers.java.level0;


public class 분수의_덧셈 {
    public static void main(String[] args) {
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;
        System.out.println(solution(numer1, denom1, numer2, denom2));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1*denom2+numer2*denom1;
        int denom = denom1*denom2;
        int gcd = getGcd(numer,denom);
        answer[0] = numer/gcd;
        answer[1] = denom/gcd;
        return answer;
    }

    private static int getGcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp%a;
        }
        return a;
    }
}