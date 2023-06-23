package org.example.programmers.java.level0;

import java.util.Arrays;

public class 직사각형_넓이_구하기 {
    public static void main(String[] args) {
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println(solution(dots));
    }
    public static int solution(int[][] dots) {
        int maxX = dots[0][0];
        int maxY = dots[0][1];
        int minX = dots[0][0];
        int minY = dots[0][1];
        for(int i = 1; i < dots.length; i++) {
            maxX = Math.max(dots[i][0],maxX);
            maxY = Math.max(dots[i][1],maxY);
            minX = Math.min(dots[i][0],minX);
            minY = Math.min(dots[i][1],minY);
        }
        int x  = maxX-minX;
        int y = maxY-minY;
        return x*y;

    }
}
