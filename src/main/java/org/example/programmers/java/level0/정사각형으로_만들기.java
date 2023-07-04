package org.example.programmers.java.level0;

public class 정사각형으로_만들기 {
    public static void main(String[] args) {

        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        System.out.println(solution(arr));
    }

    private static int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;
        int max = Math.max(x, y);
        int[][] answer = new int[max][max];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}