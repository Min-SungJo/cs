package org.example.programmers.java.level1;

public class 음양_더하기 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        double result = solution(absolutes, signs);
        System.out.println(result);
    }

    private static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
        }
        return answer;
    }
}