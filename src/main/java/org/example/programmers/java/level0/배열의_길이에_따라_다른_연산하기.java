package org.example.programmers.java.level0;

public class 배열의_길이에_따라_다른_연산하기 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        System.out.println(solution(arr, n));
    }

    private static int[] solution(int[] arr, int n) {
        int idx = (arr.length % 2 == 1) ? 0 : 1;
        for (int i = idx; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }
}