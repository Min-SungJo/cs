package org.example.programmers.java.level0;

public class 특이한_이차원_배열2 {
    public static void main(String[] args) {
        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        System.out.println(solution(arr));
    }

    public static int solution(int[][] arr) {
        for(int i = 0; i < arr.length -1; i ++) {
            if(arr[i][i+1]!=arr[i+1][i]) {
                return 0;
            }
        }
        return 1;
    }
}