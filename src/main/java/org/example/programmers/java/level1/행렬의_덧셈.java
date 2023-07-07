package org.example.programmers.java.level1;

public class 행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(solution(arr1, arr2));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] sum = arr2.clone();
        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                sum[i][j] += arr1[i][j];
            }
        }
        return sum;
    }

}