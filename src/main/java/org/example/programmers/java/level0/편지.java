package org.example.programmers.java.level0;

public class 편지 {
    public static void main(String[] args) {

        String str = "hello world";
        System.out.println(solution(str));
    }

    private static int solution(String message) {
        int answer=message.length()*2;
        return answer;
    }
}