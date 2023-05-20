package org.example.programmers.java.level0;


public class 카운트_업 {
    public static void main(String[] args) {

        int start = 3;
        int end = 10;
        int[] result = solution(start, end);
        System.out.println(result);
    }

    private static int[] solution(int start, int end) {
        int size = end - start + 1;
        int[] answer = new int[size];
        for(int i = 0; i < size; i++) {
            answer[i] = start++;
        }
        return answer;
    }
}