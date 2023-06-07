package org.example.programmers.java.level0;

import java.util.HashMap;
import java.util.HashSet;

public class A로_B_만들기 {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));
    }

    private static int solution(String before, String after) {
        for (int i = 0; i < after.length(); i++) {
            before = before.replaceFirst(after.substring(i, i + 1), "");
        }
        if (before.length() == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}