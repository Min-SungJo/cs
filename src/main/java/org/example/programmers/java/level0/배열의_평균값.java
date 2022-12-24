package org.example.programmers.java.level0;

public class 배열의_평균값 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        System.out.println(solution(numbers));
    }

    private static double solution(int[] numbers) {
        double n = 0;
        for (int i : numbers){
                n+=i;
        }
        double answer=n/ numbers.length;

        return answer;
    }
}