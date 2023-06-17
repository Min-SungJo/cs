package org.example.programmers.java.level1;

public class 정수_내림차순으로_배치하기 {

    public static void main(String[] args) {
        long n = 123;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        int length = sb.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sb.charAt(i);
        }
        insertionSort(arr);
        sb.setLength(0);
        for (int i = 0; i < length; i++) {
            sb.append(arr[length - 1 - i] - '0');
        }
        return Long.parseLong(sb.toString());
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }
}
