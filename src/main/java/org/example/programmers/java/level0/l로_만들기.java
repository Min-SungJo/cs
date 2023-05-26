package org.example.programmers.java.level0;

public class l로_만들기 {
    public static void main(String[] args) {
        String myString = "abcdefghijklvwxyz";
        System.out.println(solution(myString));
    }

    private static String solution(String myString) {
        //replaceAll 을 사용하여 변환
        String answer = myString.replaceAll("[a-k]","l");
        return answer;
    }
}