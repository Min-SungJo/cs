package org.example.programmers.java.level0;

public class 피자_나눠_먹기3 {
    public static void main(String[] args) {
        int slice =7;
        int n =7;
        System.out.println(solution(slice,n));
    }

    private static int solution(int slice, int n) {
        int answer =n/slice;
        if(n%slice!=0){
            answer++;
        }
        return answer;
    }
}