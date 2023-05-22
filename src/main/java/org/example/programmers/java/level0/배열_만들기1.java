package org.example.programmers.java.level0;

public class 배열_만들기1 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int[] result = solution(n, k);
        System.out.println(result);
    }

    public static int[] solution(int n, int k) {
        int len = n/k;
        int[] answer = new int[len];
        for(int i = 1; i <= len; i++) {
            answer[i-1] = i*k;
        }
        return answer;
    }
}