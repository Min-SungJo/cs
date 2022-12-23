package org.example.programmers.level0;

public class 아이스_아메리카노 {
    public static void main(String[] args) {

        int n = 5500;
        System.out.println(solution(n));
    }

    private static int[] solution(int money) {
        int[] answer = {money/5500,money%5500};
        return answer;
    }
}