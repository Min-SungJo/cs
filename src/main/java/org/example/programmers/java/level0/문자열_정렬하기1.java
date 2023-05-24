package org.example.programmers.java.level0;

import java.util.Arrays;

public class 문자열_정렬하기1 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        int[] result = solution(my_string);
        System.out.println(result);
    }

    private static int[] solution(String my_string) {
        String answer = my_string.replaceAll("[^0-9]","");
        int[] arr = new int[answer.length()];
        for(int i = 0 ; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(answer.substring(i,i+1));
        }
        Arrays.sort(arr);
        return arr;
    }
}