package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 배열의_원소_삭제하기 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(solution(arr, delete_list));
    }

    private static int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>(delete_list.length);
        for(int i: delete_list) {
            deleteSet.add(i);
        }
        int[] filteredArray = new int[arr.length];
        int idx = 0;
        for(int i : arr) {
            if(!deleteSet.contains(i)) {
                filteredArray[idx++] = i;
            }
        }
        int[] answer = new int[idx];
        System.arraycopy(filteredArray,0,answer,0,idx);
        return answer;
    }
}