package org.example.programmers.java.level1;

public class 기사단원의_무기 {

    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(solution(number, limit, power));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = getDivisor(i);
            cnt = cnt > limit ? power : cnt;
            answer += cnt;
        }
        return answer;
    }

    private static int getDivisor(int num) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum++;
                if (i != (num / i)) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
