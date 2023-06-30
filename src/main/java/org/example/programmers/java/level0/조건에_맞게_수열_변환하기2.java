package org.example.programmers.java.level0;

public class 조건에_맞게_수열_변환하기2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        // arr의 각 원소에 대해
        // 50보다 크거나 같은 짝수라면 2로 나누고
        // 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
        // x번 반복한 결과인 배열을 arr(x)라고 표현했을 때,
        // arr(x) = arr(x + 1)인 x가 항상 존재합니다.
        // 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
        int len = arr.length;
        int x = 0;
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < len; i++) {
                int num = arr[i];
                if (num >= 50 && num % 2 == 0) {
                    arr[i] /= 2;
                    change = true;
                } else if (num < 50 && num % 2 == 1) {
                    arr[i] += arr[i] + 1;
                    change = true;
                }
            }
            if(change) x++;
        }
        return x;
    }

}