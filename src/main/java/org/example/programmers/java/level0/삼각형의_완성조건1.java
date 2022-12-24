package org.example.programmers.java.level0;

import java.util.Arrays;

public class 삼각형의_완성조건1 {
    public static void main(String[] args) {

        int[] numbers = {1,3,2};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] sides) {
        int answer=2;
        int[] arr = Arrays.stream(sides).sorted().toArray();
        if(arr[0]+arr[1]>arr[2]){
            answer=1;
        }
        return answer;
    }
}