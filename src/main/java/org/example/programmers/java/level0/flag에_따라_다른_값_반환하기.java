package org.example.programmers.java.level0;

public class flag에_따라_다른_값_반환하기 {
    public static void main(String[] args) {

        int a = -4;
        int b = 7;
        boolean flag = true;
        int result = solution(a, b, flag);
        System.out.println(result);
    }

    private static int solution(int a, int b, boolean flag) {
        return flag ? (a + b) : (a - b);
    }
}