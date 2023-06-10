package org.example.programmers.java.level1;

public class 자릿수_더하기 {

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        int answer = 0;
        for(int i = 0; i < sb.length(); i++) {
            answer += sb.charAt(i)-'0';
        }
        return answer;
    }
}
