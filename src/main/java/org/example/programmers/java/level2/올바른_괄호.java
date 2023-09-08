package org.example.programmers.java.level2;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
        String s = "(())()";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        int idx;
        for (char c : s.toCharArray()) {
            idx = stk.size() - 1;
            if (idx == -1 && c == ')') return false;
            if (idx == -1) stk.push(c);
            else if (stk.get(idx) == '(' && c == ')') stk.setSize(idx);
            else stk.push(c);
        }
        if (stk.size() > 0) return false;
        return true;
    }

}
