package org.example.programmers.java.level2;

import java.util.ArrayList;
import java.util.Collections;

public class 구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80};
        int limit = 100;
        System.out.println(solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        // 그리디
        // 최대한 적은 구명 보트 사용
        // 배열을 정렬하여 ArrayList 에 담는다
        // 가장 큰 값을 담을 idx, 가장 작은 값을 담을 idx 선언
        // 두 수의 합을 limit 과 비교 (반복)
        // 둘의 합이 limit 를 초과하면, 가장 큰 값을 가진 사람의 idx-- answer++
        // 둘의 합이 limit 이하이면 그 둘의 idx 를 ++(작은거),--(큰거) answer++
        // idx 가 동일해질 때까지
        // 두 idx 가 동일해도 조건문에 따라 answer 를 무조건적으로 증가시킴

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : people) {
            list.add(i);
        }
        Collections.sort(list);

        int bigIdx = list.size() - 1;
        int smallIdx = 0;

        while (bigIdx >= smallIdx) {
            if (list.get(bigIdx) + list.get(smallIdx) <= limit) {
                answer++;
                bigIdx--;
                smallIdx++;
            } else {
                answer++;
                bigIdx--;
            }
        }
        return answer;
    }

}
