package org.example.programmers.java.level0;

public class 숫자_찾기 {
    public static void main(String[] args) {

        int num = 232443;
        int k = 4;
        System.out.println(solution(num, k));
    }

    private static int solution(int num, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('-').append(num);
        int answer = sb.indexOf(Integer.toString(k));
        return answer;
    }
}