package org.example.programmers.java.level1;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        int left = 24;
        int right = 27;
        System.out.println(solution(left, right));
    }

    private static int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum = (i % Math.sqrt(i) == 0) ? sum - i : sum + i;
//            System.out.println(i+" "+Math.sqrt(i));
            // 제곱수 ? 약수의 개수가 홀수 : 짝수
        }
        return sum;
    }

}