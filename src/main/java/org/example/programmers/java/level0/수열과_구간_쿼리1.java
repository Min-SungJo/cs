package org.example.programmers.java.level0;

public class 수열과_구간_쿼리1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1},{1, 2},{2, 3}};
        System.out.println(solution(arr, queries));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        for(int[] list : queries) {
            int s = list[0];
            int e = list[1];
            for(int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}