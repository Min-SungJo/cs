package org.example.programmers.org.example.algorithmDataStructure;

import java.util.Arrays;
import java.util.Scanner;

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

        System.out.print("숫자 입력: ");
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        primeNum1(inputNum);
        primeNum2(inputNum);
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
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = t;
        }
        return arr;
    }

    /**
     * 배열의 모든 요소의 합계
     */
    public static int sumOf(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        }
    }

    /**
     * 2부터, 입력한 숫자까지 소수 출력1
     */
    public static void primeNum1(int num) {
        int totalPrimeNum = 1;
        int counter = 0;
        if (num < 2) {
            System.out.println("1보다 큰 숫자를 입력하시오");
        } else if (num >= 2) {
            for (int i = 3; i <= num; i += 2) {
                for (int j = 2; j <= i; j++) {
                    counter++;
                    if (j == i) {
//                        System.out.println(j);
                        totalPrimeNum++;
                    } else {
                        if (i % j == 0) {
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("소수 수: " + totalPrimeNum);
        System.out.println("연산수: " + counter); // 77690
    }

    /**
     * 2부터, 입력한 숫자까지의 소수 출력(배열 활용)2
     */
    public static void primeNum2(int num) {
        // n 이 소수인지 확인하기 위해선 n 이하의 소수를 나누어서 확인하는 것만으로 충분하다
        if (num >= 2) {
            int counter = 0;
            int ptr = 0;
            int[] prime = new int[num / 2 + 1];
            prime[ptr++] = 2;

            for (int n = 3; n<=num; n+=2) {
                int i;
                for (i = 1; i<ptr; i++) { // 배열에 있는 값으로 연산할 예정
                    counter++;
                    if ( n % prime[i]==0) {
                        break;
                    }
                }
                if ( ptr == i ) {
                    prime[ptr++] = n;
                }
            }
            System.out.println("소수 수: "+ptr);
            System.out.println("연산수: "+counter); // 14622
        }
    }
}
