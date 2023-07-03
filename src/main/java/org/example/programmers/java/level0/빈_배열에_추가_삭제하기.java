package org.example.programmers.java.level0;

import java.util.Stack;

public class 빈_배열에_추가_삭제하기 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(solution(arr, flag));
    }

    private static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stk = new Stack<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    stk.push(arr[i]);
                }
            } else {
                stk.setSize(stk.size()-arr[i]);
            }
        }
        int size = stk.size();
        int[] answer = new int[size];
        for(int i = 0; i < size; i++) {
            answer[i] = stk.get(i);
        }
        return answer;
    }
}