package org.example.programmers.java.level0;

public class 배열_만들기3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};
        System.out.println(solution(arr, intervals));
    }

    private static int[] solution(int[] arr, int[][] intervals) {
        int start1 = intervals[0][0];
        int range1 = intervals[0][1]-start1;
        int[] arr1 = new int[range1+1];
        for(int i = 0; i <= range1; i++) {
            arr1[i] = arr[start1+i];
        }
        int start2 = intervals[1][0];
        int range2 = intervals[1][1]-start2;
        int[] arr2 = new int[range2+1];
        for(int i = 0; i <= range2; i++) {
            arr2[i] = arr[start2+i];
        }
        int[] answer = new int[range1+range2+2];
        System.arraycopy(arr1,0,answer,0,arr1.length);
        System.arraycopy(arr2,0,answer,arr1.length,arr2.length);
        return answer;
    }
}