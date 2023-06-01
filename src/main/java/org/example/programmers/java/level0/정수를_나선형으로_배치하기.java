package org.example.programmers.java.level0;

public class 정수를_나선형으로_배치하기 {
    public static void main(String[] args) {

        int n = 4;
        int[][] result = solution(n);
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.printf("%d\t", result[i][k]);
            }
            System.out.println();
        }
    }

    private static int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int dir = 0;
        int[] arrX = {1, 0, -1, 0};
        int[] arrY = {0, 1, 0, -1};
        int x = 0;
        int y = 0;
        int moveX = 0;
        int moveY = 0;
        int total = n*n;
        for (int i = 0; i < total; i++) {
            arr[y][x] = i+1;
            moveY = y + arrY[dir];
            moveX = x + arrX[dir];

            if (moveY >= 0 && moveY < n && moveX >= 0 && moveX < n && arr[moveY][moveX] == 0) {
                x = moveX;
                y = moveY;
            } else {
                dir = (dir + 1) % 4;
                x += arrX[dir];
                y += arrY[dir];
            }
        }

        return arr;
    }

}