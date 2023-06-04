package org.example.programmers.java.level0;

public class 두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        System.out.println(solution(a, b));
    }

    private static int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        return Math.max(Integer.parseInt(sb.toString()), 2 * a * b);
    }
}