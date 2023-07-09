package org.example.programmers.java.level1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        System.out.println(solution(d, budget));
    }

    private static int solution(int[] d, int budget) {
        int sum = 0;
        Arrays.sort(d);
        for(int i : d) {
            if(budget>=0) {
                sum++;
                budget-=i;
            }
        }
        if(budget<0) sum--;
        return sum;
    }
}