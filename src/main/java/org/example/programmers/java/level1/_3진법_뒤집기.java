package org.example.programmers.java.level1;

public class _3진법_뒤집기 {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        String num3 = Integer.toString(n,3);
        sb.append(num3);
        int answer = Integer.parseInt(sb.reverse().toString(), 3);
        return answer;
    }
}