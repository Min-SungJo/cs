package org.example.programmers.java.level1;

public class 소수_만들기 {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int b = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int c = nums[k];
                    if (isPrimeNum(a + b + c)) answer++;
                }
            }
        }
        return answer;
    }

    private static boolean isPrimeNum(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
