package org.example.programmers.java.level0;

import java.util.Arrays;

public class 최댓값_만들기 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,2};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] arr) {
        Arrays.sort(arr);
        int answer=arr[arr.length-2]*arr[arr.length-1];
        return answer;
    }
}