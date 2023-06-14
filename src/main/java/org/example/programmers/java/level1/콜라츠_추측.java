package org.example.programmers.java.level1;

import java.util.ArrayList;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        int n = 626331;
        System.out.println(solution(n));
    }

    public static int solution(int num) {
        if(num==1) {
            return 0;
        }
        long temp = num;
        int count = 0;
        while (count <= 500) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = (temp * 3) + 1;
            }
            count++;
            if(temp==1) {
                return count;
            }
        }
        return -1;
    }
}