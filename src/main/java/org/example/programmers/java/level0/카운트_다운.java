package org.example.programmers.java.level0;

public class 카운트_다운 {
    public static void main(String[] args) {
        int start = 10;
        int end = 3;
        int[] result = solution(start, end);
        System.out.println(result);
    }

    private static int[] solution(int start, int end) {
        int len = start - end + 1;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}