package org.example.programmers.java.level0;

import java.util.Map;

public class 커피_심부름 {
    public static void main(String[] args) {
        String[] order = {"iceamericano", "americanoice"};
        System.out.println(solution(order));
    }

    private static int solution(String[] order) {
        int answer = 0;
        Map<String, Integer> map = Map.of(
                "americano", 4500,
                "iceamericano", 4500,
                "americanoice", 4500,
                "hotamericano", 4500,
                "americanohot", 4500,
                "cafelatte", 5000,
                "icecafelatte", 5000,
                "cafelatteice", 5000,
                "hotcafelatte", 5000,
                "cafelattehot", 5000
        );
        for (String orderStr : order) {
            int pay = map.getOrDefault(orderStr, 4500);
            answer += pay;
        }
        return answer;
    }
}