package org.example.programmers.java.level1;

public class 삼총사 {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number));
    }

    public static int solution(int[] number) {
        // 세 개의 숫자를 더해서 0이 되는 경우의 수
        int len = number.length;
        int sum = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}