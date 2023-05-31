package org.example.programmers.java.level0;

public class _369게임 {
    public static void main(String[] args) {

        int order = 10000;
        System.out.println(solution(order));
    }

    private static int solution(int order) {
        StringBuilder sb = new StringBuilder();
        sb.append(order);
        int answer=0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='3'||sb.charAt(i)=='6'||sb.charAt(i)=='9') {
                answer++;
            }
        }
        return answer;
    }
}