package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 팩토리얼 {
    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        if (n < 3) {
            return n;
        }
        int[] arr = new int[10];
        int answer = 0;
        arr[0] = 1;
        arr[1] = 2;
        int temp = 0;
        for (int i = 2; i < 10; i++) {
            temp = arr[i - 1] * (i + 1);
            if(temp > n) {
                return i;
            } else if (temp == n) {
                return ++i;
            }
            arr[i] = temp;
        }
        for(int i : arr) {
            System.out.println(i);
        }
        return answer;
    }
}