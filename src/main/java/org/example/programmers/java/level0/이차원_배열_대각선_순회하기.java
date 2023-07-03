package org.example.programmers.java.level0;

public class 이차원_배열_대각선_순회하기 {
    public static void main(String[] args) {

        int[][] board = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int k = 2;
        System.out.println(solution(board, k)); // 8
    }

    private static int solution(int[][] board, int k) {
        // i+ j  <= k 를 만족하는  모든 (i,j)에 대한 board[i][j] 의 합
        int sum = 0;
        int lenX = board.length;
        int lenY = board[0].length;
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                int num = board[i][j];
                if (i + j <= k) sum += num;
            }
        }
        return sum;
    }
}