package org.example.programmers.java.level0;

import java.util.Arrays;

public class 글자_지우기 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(my_string, indices));
    }

    private static String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        int len = indices.length;
        for (int i = 0; i < len; i++){
            sb.deleteCharAt(indices[len-1-i]);
        }
        return sb.toString();
    }
}