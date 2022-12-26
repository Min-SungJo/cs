package org.example.programmers.java.level0;

public class 저주의_숫자 {
    public static void main(String[] args) {
        int num = 50;
        System.out.println(solution(num));
    }

    private static int solution(int n) {
        int answer =0;
        for(int i=0; i<=n; i++){
            answer++;
            while(answer%3==0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        return answer;
    }
}