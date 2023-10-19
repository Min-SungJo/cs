package org.example.programmers.java.level2;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class 기능_개발 {
    public static void main(String[] args) {
//        int[] progresses = {93, 30, 55};
        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 30, 5};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(progresses, speeds));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Map<Integer,Integer> map = new TreeMap<>();
        int pt = 0; // progresses 의 위치
        int days = 0; // speeds 에 곱해줄 숫자
        // 하루씩 모든 작업을 계산하는 것이 아닌, 가장 앞에 있는 작업부터 계산한다
        while (pt < progresses.length) {
            if (progresses[pt] + (speeds[pt] * days) >= 100) { //작업완료
                pt++;
                map.put(days, map.getOrDefault(days,0)+1);
            } else { // 작업 중
                days++;
            }
        }
        int[] answer = new int[map.size()];
        int idx = 0;
        for(int i : map.values()) {
            answer[idx++] = i;
        }
        return answer;
    }

}
