package org.example.programmers.org.example.algorithmDataStructure.searching;

import java.util.Scanner;

/**
 * 요소를 순서대로 검색하는 선형 검색
 */
public class 선형검색 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {6, 4, 3, 2, 1, 2, 8};

        System.out.print("검색할 값: ");
        int key = scan.nextInt();

        int idx = seqSearch(arr, key);
        if (idx == -1) {
            System.out.println("검색실패");
        } else {
            System.out.println(idx + "번째 값입니다.");
        }

        int idx2 = seqSearchSen(arr, key);
        if (idx2 == -1) {
            System.out.println("검색실패");
        } else {
            System.out.println(idx2 + "번째 값입니다.");
        }
    }

    /**
     * 선형 검색 기초
     */
    public static int seqSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 선형 검색 보초법(요소수보다 1 큰 배열을 생성하여 마지막 값에 검색할 값을 저장)
     * 종료 판단 횟수를 줄임(검색 실패 조건을 제거)
     * for 문은 종료 조건이 내포되어 있음
     */
    public static int seqSearchSen(int[] arr, int key) {
        int i = 0;

        arr[arr.length-1] = key;
        while (true) {
            if (arr[i] == key) {
                break;
            }
            i++;
        }
        return i == arr.length-1 ? -1 : i;
    }
}
