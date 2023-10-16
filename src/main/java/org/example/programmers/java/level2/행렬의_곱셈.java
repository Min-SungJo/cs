package org.example.programmers.java.level2;

public class 행렬의_곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 3, 2},{4, 2, 4},{3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        System.out.println(solution(arr1, arr2));
    }


    public static int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 곱셈
        // a의 b의 동일한 숫자위치를 곱한 것의 합 구하기
        //   a      b        c
        // 1 2 3  1 0 0   14 0 0
        // 0 0 0  2 0 0    0 0 0
        // 0 0 0  3 0 0    0 0 0
        // 00*00 01*10 02*20 00*01 01*11 02*21
        // i=0 j=0 k=0
        // i=0 j=0 k=1
        // i=0 j=0 k=2
        //
        // i=0 j=1 k=0
        // i=0 j=1 k=1
        // i=0 j=1 k=2

        // ik*kj

        // 1 4  3 3 00*00+01*10
        // 3 2  3 3 10*00+11*10
        // 4 1      20*00+21*10

        // 0 0 0  0 1 0    0  0  0
        // 1 2 3  0 2 0    0 14  0
        // 0 0 0  0 3 0    0  0  0
        int row = arr1.length;
        int col = arr2[0].length;
        int temp;

        int[][] answer = new int[row][col];

        for(int i = 0; i < row; i ++) {
            for(int j = 0; j < col; j++) {
                temp = 0;
                for(int k = 0; k < arr2.length; k++) {
                    temp+= arr1[i][k]*arr2[k][j];
                }
                answer[i][j] = temp;
            }
        }
        return answer;
    }

}
