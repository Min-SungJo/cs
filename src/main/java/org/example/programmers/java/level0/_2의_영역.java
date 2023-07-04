package org.example.programmers.java.level0;

public class _2의_영역 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {
        int frontIdx = -1;
        int backIdx = -1;
        boolean isFirst = true;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == 2 && isFirst) {
                frontIdx = i;
                backIdx = i;
                isFirst = false;
            } else if (num == 2) {
                backIdx = i;
            }
        }
        int len = backIdx - frontIdx + 1;
        int[] answer = new int[len];
        if(isFirst) return new int[] {-1};
        int idx = 0;
        for(int i = frontIdx; i <= backIdx; i++) {
            answer[idx++] = arr[i];
        }
        return answer;
    }
}