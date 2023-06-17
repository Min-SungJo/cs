package org.example;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        int result = solution(nums);
        System.out.println(result);
    }

    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int num = nums.length/2;
        return Math.min(num, set.size());
    }

    private static void quickSort(int[]arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot -1);
        quickSort(arr, pivot + 1, high);
    }

    private static int partition(int[]arr, int left, int right) {
        int low = left;
        int high = right;
        int pivot = arr[left];
        while(low <= high) {
            while (arr[low] <= pivot && low < high) {
                low++;
            }
            while (arr[high] > pivot && low < high) {
                high--;
            }
            swap(arr, low, high);
        }
        swap(arr, low, left);
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
