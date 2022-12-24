package org.example.programmers.java.level0;

public class 배열_두배_만들기 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int index = 0;
        for(int i : numbers){
            answer[index++]=i*2;
        }

        return answer;
    }
}