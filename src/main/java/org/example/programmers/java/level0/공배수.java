package org.example.programmers.java.level0;

public class 공배수 {
    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;
        int result = solution(number , n, m);
        System.out.println(result);
    }
    public static int solution(int number, int n, int m) {
        return (number%n==0&&number%m==0)?1:0;

    }
}
