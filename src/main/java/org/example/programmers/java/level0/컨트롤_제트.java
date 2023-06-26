package org.example.programmers.java.level0;

import java.util.Stack;

public class 컨트롤_제트 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        for (int i : stack) {
            sum += i;
        }

//        String[] arr = s.split(" ");
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i].equals("Z")) {
//                arr[i-1] = "0";
//                arr[i] = "0";
//            }
//        }
//        for(String str : arr) {
//            sum+= Integer.parseInt(str);
//        }
        return sum;
    }
}