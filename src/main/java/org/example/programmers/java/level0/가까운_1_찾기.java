package org.example.programmers.java.level0;

import java.util.HashSet;

public class 가까운_1_찾기 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 0};
        int idx = 4;
        System.out.println(solution(arr, idx));
    }

    private static int solution(int[] arr, int idx) {
        if(idx>=arr.length-1){
            return -1;
        }
        for(int i = idx+1; i < arr.length; i ++) {
            if(arr[i]==1) {
                return i;
            }
        }
        return -1;
    }
}