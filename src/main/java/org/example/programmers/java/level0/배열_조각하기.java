package org.example.programmers.java.level0;

import java.util.Arrays;

public class 배열_조각하기 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        System.out.println(solution(arr, query));
    }

    private static int[] solution(int[] arr, int[] query) {
        //짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
        //홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
        int s = 0;
        int e = arr.length-1;
        for(int i = 0; i < query.length; i++) {
            int idx = query[i];
            if(i%2==0) {
                e = s + idx;
            } else {
                s += idx;
            }
        }
        // int[] answer = Arrays.copyOfRange(arr, s, e+1);
        int len = e-s+1;
        int[] answer = new int[len];
        int idx = 0;
        for(int i = s; i <= e; i++) {
            answer[idx++] = arr[i];
        }
        return answer;
    }
}