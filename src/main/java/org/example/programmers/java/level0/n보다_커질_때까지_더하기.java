package org.example.programmers.java.level0;

public class n보다_커질_때까지_더하기 {
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        int result = solution(numbers, n);
        System.out.println(result);
    }

    private static int solution(int[] numbers, int n) {
        int answer = 0;
        int i = 0;
        do {
            answer += numbers[i++];
        } while (answer <= n);
        return answer;
    }
}