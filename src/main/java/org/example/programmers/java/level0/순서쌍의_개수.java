package org.example.programmers.java.level0;

import java.util.stream.IntStream;

public class 순서쌍의_개수 {
    public static void main(String[] args) {
        int n = 20;
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 1;
        if (n == 2) {
            answer++;
        } else if (n > 2) {
            for(int i = 1 ; i <= n/2+1; i++){
                if(n%i==0){
                    answer++;
                }
            }
        }
        return answer;
        // return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count(); stream 을 사용한 코드
    }
}
