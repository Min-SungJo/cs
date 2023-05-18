package org.example.programmers.java.level0;

import java.util.Arrays;

public class n_번째_원소까지 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int num = 3;
        int[] result = solution(num_list, num);
        System.out.println(result);
    }

    private static int[] solution(int[] num_list, int n) {
        // return Arrays.copyOfRange(num_list, 0, n); // 지정된 범위의 요소를 복사하여 새 배열로 만듬, 가독성이 높음
        return Arrays.stream(num_list).limit(n).toArray(); // 배열을 반복하여 스트림을 생성, 확장성이 높음(stream 추가 작업 가능)
    }
}