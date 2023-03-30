package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class n의_배수_고르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] numList = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] result = solution(n , numList);
        System.out.println(result);
    }
    public static int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();

    }
}
