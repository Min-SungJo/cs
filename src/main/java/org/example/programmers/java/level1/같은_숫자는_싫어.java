package org.example.programmers.java.level1;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int num = arr[0];
        for(int i : arr) {
            if(num!=i) {
                num = i;
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i ++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}