package org.example.programmers.java.level1;

public class 최소직사각형 {

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//        System.out.println("[[60, 50], [30, 70], [60, 30], [80, 40]]".replace("[","{").replace("]","}"));
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int maxL = 0;
        int maxR = 0;
        for(int[] list :  sizes) {
            int maxInList = Math.max(list[0],list[1]);
            int minInList = Math.min(list[0],list[1]);
            maxL = Math.max(maxL,maxInList);
            maxR = Math.max(maxR,minInList);
        }
        return maxL*maxR;
    }
}
