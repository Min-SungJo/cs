package org.example.programmers.java.level0;

import java.util.Map;

public class 영어가_싫어요 {
    public static void main(String[] args) {
        String numbers = "onefourzerosixseven";
        System.out.println(solution(numbers));
    }

    private static long solution(String numbers) {
        StringBuilder sbStr = new StringBuilder();
        StringBuilder sbLong = new StringBuilder();
        Map<String,Integer> map = Map.of(
                "zero", 0,
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4,
                "five", 5,
                "six", 6,
                "seven", 7,
                "eight", 8,
                "nine", 9);
        for(int i = 0; i < numbers.length(); i++) {
            sbStr.append(numbers.charAt(i));
            int num = map.getOrDefault(sbStr.toString(),-1);
            if(num!=-1) {
                sbLong.append(num);
                sbStr.setLength(0);
            }
        }
        return Long.parseLong(sbLong.toString());
    }
}