package org.example.programmers.java.level0;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class 등수_매기기 {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {70, 80}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(solution(score));
    }

    private static int[] solution(int[][] score) {
        int length = score.length;
        Integer sortedScore[] = new Integer[score.length];
        for(int i = 0; i < length; i++) {
            sortedScore[i] = score[i][0]+score[i][1];
        }
        Arrays.sort(sortedScore);
        int[] reverse = new int[length];
        for(int i = 0; i< length; i++) {
            reverse[i] = sortedScore[length-1-i];
        }

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int idx = 0;
        for(int i : reverse) {
            idx++;
            int check = map.getOrDefault(i,0);
            if(check==0){
                map.put(i,idx);
            }
        }
        int[] answer = new int[length];
        for(int i = 0; i < length; i++) {
            int sum = score[i][0]+score[i][1];
            answer[i] = map.get(sum);
        }
        return answer;
    }
}