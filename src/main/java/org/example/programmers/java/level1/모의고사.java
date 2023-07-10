package org.example.programmers.java.level1;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {

    public static void main(String[] args) {
//        int[] answers = {};
        int[] answers = {6, 6, 6, 6, 2};
//        int[] answers = {1, 2, 3, 4, 5};
//        int[] answers = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int peo = answers.length;
        int[] score = new int[peo];
        for (int i = 0; i < pattern.length; i++) {
            int len = pattern[i].length;
            for (int j = 0; j < score.length; j++) {
                int num = answers[j];
                if (num == pattern[i][j % len]) score[i]++;
            }
        }
        int max = -1;
        for (int i : score) {
            max = max > i ? max : i;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < peo; i++) {
            if (max == score[i]) list.add(i + 1);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
