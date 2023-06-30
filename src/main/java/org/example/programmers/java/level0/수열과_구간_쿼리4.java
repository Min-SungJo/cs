package org.example.programmers.java.level0;

public class 수열과_구간_쿼리4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        System.out.println(solution(arr, queries));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        for (int[] list : queries) {
            int idxI = list[0];
            int idxJ = list[1];
            int k = list[2];
            for(int i = idxI; i <= idxJ; i++) {
                if(i%k==0) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}