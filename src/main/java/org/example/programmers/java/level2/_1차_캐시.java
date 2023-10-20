package org.example.programmers.java.level2;

import java.util.ArrayList;

public class _1차_캐시 {
    public static void main(String[] args) {
        int cacheSize = 3;
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        System.out.println(solution(cacheSize, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        // hit -> 1
        // miss -> 5
        // LRU 알고리즘
        // 처리할 작업을 차례대로 읽으며 캐시 배열에 입력한다
        // 입력할 작업이 캐시에 없다면 배열의 값을 한칸씩 뒤로 밀고 제일 앞에 작업을 입력
        // 캐시에 있다면 값이 있는 위치에 앞에서부터 차례로 뒤로 밀고 제일 앞에 작업을 입력
        ArrayList<String> list = new ArrayList<>();
        int num;
        for (String city : cities) {
            city = city.toUpperCase();
            if (list.contains(city) && cacheSize > 0) { // hit
                num = 1;
                list.remove(city);
            } else { // miss
                num = 5;
                if (list.size() == cacheSize && list.size() != 0) list.remove(0);
            }
            answer += num;
            list.add(city);
        }
        return answer;
    }

}
