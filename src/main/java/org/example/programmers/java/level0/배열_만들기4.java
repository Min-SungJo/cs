package org.example.programmers.java.level0;

import java.util.Stack;

public class 배열_만들기4 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int idx = 0;
        int arrLen = arr.length;
        while (idx < arrLen) {
            int stkIdx = stk.size() - 1;
            if (stkIdx==-1) {
                stk.add(arr[idx++]);
            } else if (stk.get(stkIdx) < arr[idx]) {
                stk.add(arr[idx++]);
            } else {
                stk.remove(stkIdx);
            }
        }
        int[] answer = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }
        return answer;
    }
}