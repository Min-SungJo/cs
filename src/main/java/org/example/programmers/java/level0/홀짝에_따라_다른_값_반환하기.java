package org.example.programmers.java.level0;

public class 홀짝에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        int n = 7;
        int result = solution(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                answer+=i;
            }
        } else {
            for(int i = 2; i <= n; i+=2) {
                answer+= i*i;
            }
        }
        return answer;
    }
}