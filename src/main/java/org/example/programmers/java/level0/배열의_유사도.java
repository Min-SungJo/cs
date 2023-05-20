package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.List;

public class 배열의_유사도 {
    public static void main(String[] args) {

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int result = solution(s1, s2);
        System.out.println(result);
    }

    private static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s11 : s1) {
            for(String s22 : s2 ) {
                if(s11.equals(s22)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}