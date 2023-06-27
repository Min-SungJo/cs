package org.example.programmers.java.level0;

public class 구슬을_나누는_경우의_수 {
    public static void main(String[] args) {

        int balls = 10;
        int share = 4;
        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {
        long sum = 1;
        int idx = 1;
        for (int i = share + 1; i <= balls; i++) {
            sum*=i;
            sum/=idx++;
        }
        return (int)sum;
    }
}