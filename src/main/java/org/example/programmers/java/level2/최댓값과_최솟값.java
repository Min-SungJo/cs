package org.example.programmers.java.level2;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String[] arrS = s.split(" ");
        int[] arr = new int[arrS.length];
        for(int i = 0; i < arrS.length; i++) {
            arr[i] = Integer.parseInt(arrS[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ").append(arr[arr.length-1]);
        return sb.toString();
    }

}
