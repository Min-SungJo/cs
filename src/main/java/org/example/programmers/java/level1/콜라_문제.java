package org.example.programmers.java.level1;

public class 콜라_문제 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int n = 10;
        System.out.println(solution(a, b, n));
    }

    public static int solution(int a, int b, int n) {
        int pay = a; // 3
        int payback = b; // 2
        int total = n; // 10
        int answer = 0; // 16
//        while (n >= a) {
//            int num = n / a * b;
//            n %= a;
//            answer += num;
//            n += num;
//        }
//        if (total <= payback) return 0;
        answer = (total - payback) / (pay - payback) * payback;
        return answer;
    }
}
