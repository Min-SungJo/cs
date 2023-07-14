package org.example.programmers.java.level1;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        System.out.println(solution(n, m));
    }

    private static int[] solution(int n, int m) {
        int gcd = getGcd(n, m); // 최대 공약수
        int lcm = (n * m) / gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }

    private static int getGcd(int n, int m) {
        while (m != 0) {
            int temp = n;
            n = m;
            m = temp % n;
        }
        return n;
    }
}