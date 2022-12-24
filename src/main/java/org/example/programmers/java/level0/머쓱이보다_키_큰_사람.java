package org.example.programmers.java.level0;

public class 머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {

        int[] array = {1,3,3,4};
        int n = 3;
        System.out.println(solution(array,n));
    }

    private static int solution(int[] array, int height) {
        int answer=0;
        for(int i:array){
            if (i>height){
                answer++;
            }
        }
        return answer;
    }
}