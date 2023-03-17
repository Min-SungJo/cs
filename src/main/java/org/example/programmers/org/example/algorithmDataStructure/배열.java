package org.example.programmers.org.example.algorithmDataStructure;

import java.util.Arrays;

/**
 * 같은 자료형의 변수인 구성 요소(component)가 모인 것
 */
public class 배열 {
    public static void main(String[] args) {
        // 선언
        /** 배열 변수, 배열 그 자체는 아님 */
        int[] a;
        // 참조, 배열 본체 생성 0, 1, 2, 3, 4
        a = new int[5];
        // 접근, access
        // 배열 변수 이름 [인덱스] 를 통해 특정(인덱스에 해당하는) 구성요소에 접근

        /**요소값을 초기화 하면서 배열을 선언*/
        int[] arrInt = {1, 2, 3, 5, 4};

        StringBuilder arr = new StringBuilder();
        System.out.println(arr.append("배열: ").append(Arrays.toString(arrInt)));

        StringBuilder max = new StringBuilder();
        System.out.println(max.append("최댓값: ").append(maxOf(arrInt)));

        StringBuilder rev = new StringBuilder();
        System.out.println(rev.append("역순: ").append(Arrays.toString(arrRev(arrInt))));
        // Arrays.toString()은 모든 요소를 , 로 구분하여 []로 둘러싼 문자열을 얻음

        StringBuilder sum = new StringBuilder();
        System.out.println(sum.append("총합: ").append(maxOf(arrInt)));
    }

    /**
     * 배열의 최댓값 구하기
     */
    public static int maxOf(int[] arr) {
        // 배열의 최댓값 구하기 n-1
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    /**
     * 배열 요소를 역순으로 정렬
     */
    public static int[] arrRev(int[] arr) {
        int t = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            t = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = t;
        }
        return arr;
    }

    /**
     * 배열의 모든 요소의 합계
     * */
    public static int sumOf(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }else {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        }
    }
}
