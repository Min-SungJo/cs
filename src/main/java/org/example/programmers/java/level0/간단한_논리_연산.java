package org.example.programmers.java.level0;

public class 간단한_논리_연산 {
    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;
        System.out.println(solution(x1, x2, x3, x4));
    }

    private static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2)&&(x3||x4);
    }
}