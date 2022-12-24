package org.example.programmers.java.level0;

public class 중복된_숫자_개수 {
    public static void main(String[] args) {

        int[] array = {1,3,3,4};
        int n = 3;
        System.out.println(solution(array,n));
    }

    private static int solution(int[] array, int n) {
        int answer=0;
        for(int i:array){
            if (i==n){
                answer++;
            }
        }
        return answer;
    }
}