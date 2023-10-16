package org.example.programmers.java.level2;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        // 논문 n 편 중,
        // h 번 이상 인용된 논문이 h 편 이상 인용되었다면
        // h 의 최댓값 구하기
        // 일단 정렬
        // 인용 수 | 해당 논문보 인용횟수가 큰 논문 수
        // arr[i]| arr.length - i
        // 0     | 5 -> 인용수5 이상 논문 5 이상?
        // 1     | 4 -> 인용수4 이상 논문 4 이상?
        // 3     | 3 -> 인용수3 이상 논문 3 이상? true
        // 5     | 2
        // 6     | 1
        // arr[i] >= arr.length - i
        int answer = 0;
        Arrays.sort(citations);
        int len = citations.length;
        for(int i = 0; i < len; i++) {
            // System.out.println(citations[i]+ " " + (len-i));
            if(citations[i] >= len - i) {
                answer = len - i;
                break;
            }
        }
        return answer;
    }

}
