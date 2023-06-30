package org.example.programmers.java.level0;

public class 수열과_구간_쿼리2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(solution(arr, queries));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        int answerIdx = 0;
        for (int[] list : queries) {
            int s = list[0];
            int e = list[1];
            int k = list[2];
            int temp = -1;
            for (int i = 0; i < e-s+1; i++) {
                int num = arr[i+s];
                if(num>k) {
                    temp= temp==-1?num:Math.min(temp,num);
                }
            }
            answer[answerIdx++] = temp;
        }
        return answer;
    }
}