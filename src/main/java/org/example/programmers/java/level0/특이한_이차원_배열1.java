package org.example.programmers.java.level0;

public class 특이한_이차원_배열1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i ++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}