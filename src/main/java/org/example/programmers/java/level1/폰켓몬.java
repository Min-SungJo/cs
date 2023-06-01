package org.example.programmers.java.level1;

import java.util.HashSet;

public class 폰켓몬 {

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        int result = solution(nums);
        System.out.println(result);
    }

    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int num = nums.length / 2;
        return Math.min(num, set.size());
    }
}
