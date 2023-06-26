package org.example.programmers.java.level0;

import java.util.LinkedHashSet;

public class 소인수분해 {
    public static void main(String[] args) {
        int n = 420;
        System.out.println(solution(n));
    }

    private static int[] solution(int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int i = 2;
        while (n!=1) {
            if(n%i==0) {
                set.add(i);
                n/=i;
            } else {
                i++;
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        for(int j : set) {
            answer[idx++] = j;
        }
        return answer;
    }
}