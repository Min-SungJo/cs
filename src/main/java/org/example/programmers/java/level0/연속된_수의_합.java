package org.example.programmers.java.level0;

public class 연속된_수의_합 {
    public static void main(String[] args) {
        int num = 3;
        int total = 15;
        System.out.println(solution(num, total));
    }

    private static int[] solution(int num, int total) {
        int[] arr = new int[num];
        int plusNum = total / num - (num - 1) / 2;
        if (num == 1) {
            arr[0] = total;
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = plusNum++;
        }
        return arr;
    }
}