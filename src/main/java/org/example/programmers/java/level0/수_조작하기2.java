package org.example.programmers.java.level0;

import java.util.HashMap;

public class 수_조작하기2 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }

    private static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'w');
        map.put(-1, 's');
        map.put(10, 'd');
        map.put(-10, 'a');

        for (int i = 1; i < numLog.length; i++) {
            char c = map.get(numLog[i] - numLog[i - 1]);
            sb.append(c);
        }
        return sb.toString();
    }
}