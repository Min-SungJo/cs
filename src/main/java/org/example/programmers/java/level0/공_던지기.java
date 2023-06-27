package org.example.programmers.java.level0;

public class 공_던지기 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        System.out.println(solution(numbers, k));
    }

    private static int solution(int[] numbers, int k) {
        int len = numbers.length;
        int answer = numbers[(k-1)*2%len];
        return answer;
    }
}