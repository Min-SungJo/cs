package org.example.programmers.java.level0;

public class 주사위_게임1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int result = solution(a, b);
        System.out.println(result);
    }

    private static int solution(int a, int b) {
        int answer = a+b;
        if((answer)%2==1){
            answer*=2;
        } else if(a%2==1){
            answer = a*a + b*b;
        } else {
            answer = Math.abs(a-b);
        }
        return answer;
    }
}