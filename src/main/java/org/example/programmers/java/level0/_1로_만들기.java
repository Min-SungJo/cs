package org.example.programmers.java.level0;

public class _1로_만들기 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        // 짝수 -> 나누기 2
        // 홀수 -> -1
        // 배열의 모든 정수가 1이 되기 위해 필요한 나누기 연산 수
        int sum = 0;
        for(int i : num_list) {
            while (i!=1) {
                i/=2;
                sum++;
            }
        }
        return sum;
    }
}