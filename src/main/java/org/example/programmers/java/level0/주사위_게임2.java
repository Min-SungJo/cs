package org.example.programmers.java.level0;

import java.util.*;

public class 주사위_게임2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 1;
        int result = solution(a, b, c);
        System.out.println(result);
    }

    private static int solution(int a, int b, int c) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(a, b, c));
        Set<Integer> set = new HashSet<>(arr);
        int answer = 1;
        int count = 4 - set.size();
        for (int i = 1; i <= count; i++) {
            answer *= (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }
        return answer;
    }
}