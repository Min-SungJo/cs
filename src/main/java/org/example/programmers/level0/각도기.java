package org.example.programmers.level0;

import java.util.Scanner;

public class 각도기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle =sc.nextInt();
        System.out.println(solution(angle));
    }

    private static int solution(int angle) {

        int answer =1;
        if (angle==90){
            answer=2;
        } else if (angle>90&&angle<180) {
            answer=3;
        } else if (angle==180) {
            answer=4;
        }
        return answer;
    }
}