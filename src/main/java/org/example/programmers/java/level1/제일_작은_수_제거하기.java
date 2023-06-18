package org.example.programmers.java.level1;

public class 제일_작은_수_제거하기 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {
        int length = arr.length;
        if(length==1) return new int[] {-1};
        int minIdx = 0;
        for(int i = 1; i < length; i++) {
            if (arr[minIdx]>arr[i]) {
                minIdx = i;
            }
        }
        int[] answer = new int[length-1];
        int answerIdx = 0;
        for(int i = 0; i < length; i++) {
            if(i==minIdx) {
                continue;
            }
            answer[answerIdx++] = arr[i];
        }
        return answer;
    }
}
