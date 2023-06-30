package org.example.programmers.java.level0;

import java.time.LocalDate;

public class 날짜_비교하기 {
    public static void main(String[] args) {
        int[] date1 = {10000, 12, 15};
        int[] date2 = {0, 12, 17};
        System.out.println(solution(date1, date2));
    }

    private static int solution(int[] date1, int[] date2) {
        //1 이 2보다 과거면 1
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                return 1;
            } else if(date1[i] > date2[i]) {
                return 0;
            }
        }
        LocalDate dateA = LocalDate.of(date1[0],date1[1],date1[2]);
        LocalDate dateB = LocalDate.of(date2[0],date2[1],date2[2]);
        if(dateA.isBefore(dateB)){
            return 1;
        }
        return 0;
    }
}