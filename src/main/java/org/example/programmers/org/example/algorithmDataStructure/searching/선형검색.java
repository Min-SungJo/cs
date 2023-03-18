package org.example.programmers.org.example.algorithmDataStructure.searching;

import java.util.Scanner;

/**
 * 요소를 순서대로 검색하는 선형 검색
 * */
public class 선형검색 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {6,4,3,2,1,2,8};

        System.out.print("검색할 값: ");
        int key = scan.nextInt();

        int idx = seqSearch(arr, key);
        if (idx == -1) {
            System.out.println("검색실패");
        } else {
            System.out.println(idx+"번째 값입니다.");
        }
    }

    public static int seqSearch(int[] arr, int key){
        for (int i = 0; i< arr.length; i++ ){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
