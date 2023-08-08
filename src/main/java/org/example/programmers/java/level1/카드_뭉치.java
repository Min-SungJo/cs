package org.example.programmers.java.level1;

import java.util.Arrays;

public class 카드_뭉치 {

    public static void main(String[] args) {
//        String[] cards1 = {"i", "drink", "water"};
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
//        String[] goal = {"i", "want", "to", "drink", "water"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < goal.length; i++) {
            String s = goal[i];
            if (idx1 < cards1.length && s.equals(cards1[idx1])) {
                idx1++;
            }
            else if (idx2 < cards2.length && s.equals(cards2[idx2])) {
                idx2++;
            }
            else return "No";
        }
        return "Yes";
    }
}
