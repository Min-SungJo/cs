package org.example.programmers.java.level0;

public class 겹치는_선분의_길이 {
    public static void main(String[] args) {
        int[][] lines = {{0,1},{2,5},{3,9}};
        System.out.println(solution(lines));
    }

    private static int solution(int[][] lines) {
        int answer =0;
        int [] arr = new int[201];
        for(int[] line : lines){
            for(int i = line[1];i>line[0];i--){
                arr[i+100]+=1;
            }
        }
        for(int i : arr){
            if(i>1){
                answer++;
            }
        }
        return answer;
    }
}