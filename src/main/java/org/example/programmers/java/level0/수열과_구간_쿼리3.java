package org.example.programmers.java.level0;

public class 수열과_구간_쿼리3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        System.out.println(solution(arr, queries));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        for (int[] list : queries) {
            int idxI = list[0];
            int idxJ = list[1];
            int temp = arr[idxI];
            arr[idxI] = arr[idxJ];
            arr[idxJ] = temp;
        }
        return arr;
    }
}