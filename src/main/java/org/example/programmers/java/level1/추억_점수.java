package org.example.programmers.java.level1;

import java.util.HashMap;

public class 추억_점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(solution(name, yearning, photo));
    }

    private static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int n = 0;
            for (int j = 0; j < photo[i].length; j++) {
                n += map.getOrDefault(photo[i][j], 0);
            }
            answer[i] = n;
        }
        return answer;
    }
}