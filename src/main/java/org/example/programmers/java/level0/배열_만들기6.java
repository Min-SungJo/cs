package org.example.programmers.java.level0;

import java.util.Stack;

public class 배열_만들기6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {
        int idx = 0;
        Stack<Integer> stk = new Stack<>();
        while (idx < arr.length) {
            if(stk.isEmpty()) {
                stk.push(arr[idx++]);
            } else if(stk.peek()==arr[idx]) {
                stk.pop();
                idx++;
            } else {
                stk.push(arr[idx++]);
            }
        }
        int len = stk.size();
        if (stk.empty()) return new int[] {-1};
        int[] answer = new int[len];
        for(int i = 0; i<len; i++) {
            answer[i] = stk.get(i);
        }
        return answer;
    }
}