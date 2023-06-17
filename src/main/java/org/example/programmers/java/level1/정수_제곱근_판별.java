package org.example.programmers.java.level1;

import java.util.Stack;

public class 정수_제곱근_판별 {

    public static void main(String[] args) {
        long n = 123;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        double sqrt = Math.sqrt(n);
        if(sqrt%1==0) {
            return (long)Math.pow((sqrt+1),2);
        }
        return -1;
    }
}
