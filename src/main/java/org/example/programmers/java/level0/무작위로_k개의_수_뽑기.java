package org.example.programmers.java.level0;

import java.util.LinkedHashSet;

public class 무작위로_k개의_수_뽑기 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1};
        int k = 4;
        System.out.println(solution(arr, k));
    }

    private static int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            if (set.size() == k) break;
        }
        int[] answer = new int[k];
        int idx = 0;
        for(int i : set) {
            answer[idx++] = i;
        }
        while(idx != k) {
            answer[idx++] = -1;
        }
        return answer;
    }
}