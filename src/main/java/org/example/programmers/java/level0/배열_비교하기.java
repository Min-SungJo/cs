package org.example.programmers.java.level0;

import java.util.Arrays;

public class 배열_비교하기 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(solution(arr1, arr2));
    }

    private static int solution(int[] arr1, int[] arr2) {
        if(arr1.length> arr2.length) {
            return 1;
        } else if (arr2.length > arr1.length) {
            return -1;
        }
        int arr1sum = 0;
        int arr2sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1sum+=arr1[i];
            arr2sum+=arr2[i];
        }
        if (arr1sum>arr2sum) {
            return 1;
        } else if (arr2sum > arr1sum) {
            return -1;
        }
        return 0;
    }
}