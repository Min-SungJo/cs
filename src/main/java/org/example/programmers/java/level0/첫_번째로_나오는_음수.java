package org.example.programmers.java.level0;

import java.util.Arrays;

public class 첫_번째로_나오는_음수 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        int result = solution(num_list);
        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        int answer = -1;
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i]<=answer){
                return i;
            }
        }
        return answer;
    }
}