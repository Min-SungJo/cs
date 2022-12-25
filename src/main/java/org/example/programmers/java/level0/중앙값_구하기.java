package org.example.programmers.java.level0;

import java.util.Arrays;

public class 중앙값_구하기 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}