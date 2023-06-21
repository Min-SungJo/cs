package org.example.programmers.java.level0;

import java.util.Arrays;
import java.util.HashMap;

public class 진료순서_정하기 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        System.out.println(solution(emergency));
    }

    private static int[] solution(int[] emergency) {
        int length = emergency.length;

        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);
        int[] answer = new int[length];
//        for (int i = 0; i < length; i++) {
//            int key = emergency[i];
//            int idx = 0;
//            while (true) {
//                if (key == sortedEmergency[idx++]) break;
//            }
//            answer[i] = length - idx + 1;
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(sortedEmergency[length - i - 1], i + 1);
        }
        for (int i = 0; i < length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}