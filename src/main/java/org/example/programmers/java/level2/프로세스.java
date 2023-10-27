package org.example.programmers.java.level2;

import java.util.*;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            queue.offer(i);
        }
        // 119111 9 찾기,
        // 191111
        // 911111
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }

}
