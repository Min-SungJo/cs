package org.example.programmers.java.level0;

public class _2차원으로_만들기 {
    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        System.out.println(solution(num_list, n));
    }

    private static int[][] solution(int[] num_list, int n) {
        int length = num_list.length;
        int row = length/n;
        int remainder = length%n;
        if(remainder>0) {
            row++;
        }
        int[][] arr = new int[row][n];
        for(int i = 0; i < length; i++) {
            int colIdx = i%n;
            int rowIdx = i/n;
            arr[rowIdx][colIdx] = num_list[i];
        }
        return arr;
    }
}