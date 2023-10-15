package org.example.programmers.java.level2;

public class n2_배열_자르기 {
    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;
        System.out.println(solution(n, left, right));
    }

    public static int[] solution(int n, long left, long right) {
        int len = (int) (right - left + 1);
        int[] answer = new int[len];
        long num, idx;
        for (int i = 0; i < len; i++) {
            idx = i + left;
            num = Math.max(idx / n, idx % n) + 1;
            answer[i] = (int)num;
        }
        return answer;
    }

}
