package org.example.programmers.level0;

public class 피자_나눠_먹기1 {
    public static void main(String[] args) {
        int n =7;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer =n/7;
        if(n%7!=0){
            answer++;
        }
        return answer;
    }
}