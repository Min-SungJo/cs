package org.example;

import java.util.HashSet;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 3};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr;
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // key 와 그 왼쪽에 있는 수를 비교
            int j = i - 1;

            // key = 4
            // j = 선택된 값의 인덱스 - 1
            while (j >= 0 && arr[j] > key) { // key 가 [j] 보다 작으면 정지
                arr[j + 1] = arr[j]; // 다음 값
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
