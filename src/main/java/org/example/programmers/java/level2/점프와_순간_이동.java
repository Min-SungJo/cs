package org.example.programmers.java.level2;

public class 점프와_순간_이동 {
    public static void main(String[] args) {
        int n = 5000;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int ans = 0;
        while (n != 0) {
            if (n % 2 == 1) { // 홀수면 -1, ans + 1
                ans++;
                n--;
            }else {
                n = div2(n);
            }
        }
        return ans;
    }

    static int div2(int n) { // 2로 나눠지지 않을때까지 2로 나누는 메서드
        while (n % 2 == 0) { // 짝수면 2로 나눈다
            n /= 2;
        }
        return n;
    }
}
