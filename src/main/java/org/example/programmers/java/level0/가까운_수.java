package org.example.programmers.java.level0;

public class 가까운_수 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        int result = solution(array, n);
        System.out.println(result);
    }

    private static int solution(int[] array, int n) {
        int num = array[0]; // 비교 값을 저장
        int temp = minus(n, num); // 차를 저장
        for (int i : array) {
            int tempMinus = minus(n, i);
            if (tempMinus < temp) {
                temp = tempMinus;
                num = i;
            } else if (tempMinus == temp) {
                num = Math.min(num, i);
            }
        }
        return num;
    }

    private static int minus(int a, int b) {
        return Math.abs(a - b);
    }

}
