package org.example.programmers.java.level0;

public class 세균_증식 {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        int result = solution(n,t);
        System.out.println(result);
    }
    public static int solution(int n, int t) {
        int answer = n;
        for (int i = 1; i<=t ; i++) {
            answer*=2;
        }
        return answer;
    }
}
