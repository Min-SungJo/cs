package org.example.programmers.org.example.algorithmDataStructure.searching;

import java.util.Arrays;

/**
 * 데이터가 키값으로 이미 정렬(sort)되어 있다는 전제 조건
 * 선형 검색보다 좀 더 빠르게 검색 가능
 * 배열 중앙값을 기준으로 검색
 */
public class 이진검색 {
    public static void main(String[] args) {
        int[] arr = {15, 27, 39, 77, 92, 108, 121};
        int key = 39;
        int idx = BinSearch(arr, key);
        System.out.println(idx + "번째에 있음");

        /**Arrays 라이브러리*/
        int idx2 = Arrays.binarySearch(arr, key);
        System.out.println(idx2 + "번째에 있음");
    }

    public static int BinSearch(int[] arr, int key) {
        /**검색범위의 첫 인덱스*/
        int firIdx = 0;
        /**검색범위의 끝 인덱스*/
        int lasIdx = arr.length - 1;

        do {
            /**중앙값*/
            int centIdx = (firIdx + lasIdx) / 2;
            if (arr[centIdx] == key) {
                return centIdx;
            } else if (arr[centIdx] < key) {
                firIdx = centIdx + 1;
            } else {
                lasIdx = centIdx - 1;
            }
        } while (firIdx <= lasIdx);
        return -1;
    }
}
