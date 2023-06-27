package org.example.programmers.java.level0;

public class 평행 {
    public static void main(String[] args) {
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
//        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
//        String s = "[[1, 4], [9, 2], [3, 8], [11, 6]]".replace("[","{").replace("]","}");
//        String s = "[[3, 5], [4, 1], [2, 4], [5, 10]]".replace("[","{").replace("]","}");
//        System.out.println(s);
        System.out.println(solution(dots));
    }

    private static int solution(int[][] dots) {
        // 기울기 구하기 - y의 증가량/x의 증가량
        if(getSlope(dots[0],dots[1])==getSlope(dots[2],dots[3])) return 1;
        if(getSlope(dots[0],dots[2])==getSlope(dots[1],dots[3])) return 1;
        if(getSlope(dots[0],dots[3])==getSlope(dots[1],dots[2])) return 1;
        return 0;
    }
    private static double getSlope(int[] a, int[] b) {
        return ((double)a[1]-b[1])/(a[0]-b[0]);
    }
}