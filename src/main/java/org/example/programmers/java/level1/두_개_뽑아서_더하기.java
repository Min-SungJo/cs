package org.example.programmers.java.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] numbers) {
//        HashSet<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int size = set.size();
        int[] answer = new int[size];
        int idx = 0;
        for(int i : set) {
            answer[idx++] = i;
        }
//        Arrays.sort(answer);
        return answer;
    }

}