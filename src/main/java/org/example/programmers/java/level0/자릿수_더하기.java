package org.example.programmers.java.level0;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        int n = 1234;
        int result = solution(n);
        System.out.println(result);
    }
    private static int solution(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum+=num.charAt(i)-48;
        }
        return sum;
    }
}