package org.example.programmers.java.level2;

public class 예상_대진표 {
    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;
        System.out.println(solution(n, a, b));
    }

    public static int solution(int n, int a, int b) {
        int answer = 0;
        // 토너먼트, 부전승 없음
        // 둘이 만나게 되려면 몇 번을 거치나?
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        return answer;
    }
}
